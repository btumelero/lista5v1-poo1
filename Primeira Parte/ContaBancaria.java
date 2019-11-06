/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

import java.util.ArrayList;
/**
 *
 * @author bruno.191196
 */
public class ContaBancaria {
  private double saldo=0, limiteSaque=0, taxaSaque=0;
  ArrayList<Cartao> listaCartoes = new ArrayList<>();
  ArrayList<Cliente> listaClientes = new ArrayList<>();
  ArrayList<ArrayList<String>> matrizHistorico = new ArrayList<>();
  ArrayList<String> historico;
  int pos=-1;
  
  public void registarCliente(Cliente cliente) {
    listaClientes.add(cliente); //adiciona o cliente na lista de clientes
    historico = new ArrayList<>();
    matrizHistorico.add(historico);
  }
  
  private int clienteJaExiste(Cliente cliente) {
    for (int i=0; i<listaClientes.size(); i++) {
      if (cliente.NUMERO_CONTA.equals(listaClientes.get(i).NUMERO_CONTA)) {
        return i;
      }
    }
    return -1;
  }
  
  public void adicionarCartao(Cliente cliente, Cartao cartao) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      listaCartoes.add(cartao);
    } else {
      System.out.println("O cliente precisa ter uma conta para adicionar um cartão");
    }
  }
  
  private void armazenarNoHistorico(Cliente cliente, String operacao) {
    pos = clienteJaExiste(cliente);                                                    
    if (pos>=0) {                              //se o cliente já estiver registrado
      matrizHistorico.get(pos).add(operacao);  //armazena a operação feita no histórico dele
    } else {
      System.out.println("Clientes não registrados não possuem histórico");
    }
  }
  
  private boolean ehNumero(String valor) {
    for (int i = 0; i < valor.length(); i++) {
      if (!Character.isDigit(valor.charAt(i))) {
        return false;
      }
    }
    return true;
  }


  
  private void deposito(double valor, Cliente cliente) {
    armazenarNoHistorico(cliente, "Depósito");
    saldo = saldo + valor;
    modificaTaxaSaque();
    System.out.println("Você depositou " + valor + " reais com sucesso!");
  }
  
  public void setDeposito(String valor, Cliente cliente) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      double valorDouble;
      if(ehNumero(valor)==true) {
        valorDouble=Double.parseDouble(valor);
        deposito(valorDouble, cliente);
      } else {
        System.out.println("Valor inválido, tente novamente.");
      }
    } else {
      System.out.println("O cliente precisa estar registrado para poder fazer um depósito");
    }
  }
  

  
  
  private void saque(double valor, Cliente cliente) {
    if (valor>limiteSaque) {
      System.out.println("Não há saldo suficiente");
    } else {
      modificaTaxaSaque();
      saldo = saldo - valor - taxaSaque;
      armazenarNoHistorico(cliente, "Saque");
    }
    System.out.println("Você sacou " + valor + " reais com sucesso!");
  }
  
  public void setSaque(String valor, Cartao cartao, Cliente cliente) {
    pos = clienteJaExiste(cliente);
    limiteSaque = saldo - taxaSaque;
    if (pos>=0) {
      double valorDouble;
      if (cartao instanceof CartaoDebito) {
        if(ehNumero(valor)==true) {
          valorDouble=Double.parseDouble(valor);
          saque(valorDouble, cliente);
        }
      } else {
        System.out.println("Você não pode fazer saques com o cartão de crédito");
      }
    } else {
      System.out.println("O cliente precisa estar registrado para fazer um saque");
    }
  }
  

  
  
  
  
  
  public void paga(Cliente cliente, Cartao cartao, ContaBancaria conta, double valor) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      if (cartao instanceof CartaoDebito) {
        if (valor<saldo) {
          saldo = saldo - valor;
          conta.saldo = conta.saldo + valor;
          conta.modificaTaxaSaque();
          System.out.println("Você pagou " + valor + " reais com sucesso!");
        } else {
          System.out.println("Você não possui saldo suficiente para a operação");
        }
      } else {
        if (((CartaoCredito) cartao).getValorGasto() + valor > ((CartaoCredito) cartao).getGastoMaximo()) {
          System.out.println("Limite extourou, não foi possível realizar a operação");
        } else {
          ((CartaoCredito) cartao).setValorGasto(valor);
          conta.deposito(valor, cliente);
        }
      }
    } else {
      System.out.println("O cliente precisa estar registrado para poder pagar");
    }
  }
  
  public void pagaCartoes(Cliente cliente) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      for (int i=0; i<listaCartoes.size(); i++) {
        if (listaCartoes.get(i) instanceof CartaoCredito) {
          if (saldo>((CartaoCredito) listaCartoes.get(i)).getValorGasto()) {
            saldo = saldo - ((CartaoCredito) listaCartoes.get(i)).getValorGasto();
          } else {
            System.out.println("Não há saldo suficiente para pagar os gastos do cartão " + i);
          }
        }
      }
    } else {
      System.out.println("O cliente precisa estar registrado para poder pagar as contas do seu cartão");
    }
  }
  

  
  
  private void historico(Cliente cliente) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      System.out.println("Nome do cliente: " + cliente.NOME);
      System.out.println("Número da conta: " + cliente.NUMERO_CONTA);
      if (cliente instanceof PessoaFisica) {
        System.out.println("CPF: " + ((PessoaFisica) cliente).cpf);
      } else {
        System.out.println("CNPJ: " + ((PessoaJuridica) cliente).cnpj);
      }
      for (int i=0; i<matrizHistorico.get(pos).size(); i++) {
        System.out.println(i + "ª ação registrada no histórico:");
        System.out.println(matrizHistorico.get(pos).get(i));
      }
    } else {
      System.out.println("O cliente precisa estar registrado para poder ter um histórico");
    }
  }

  public void getHistorico(Cliente cliente) {
    historico(cliente);
  }
  
  public void getSaldo(Cliente cliente) {
    pos = clienteJaExiste(cliente);
    if (pos>=0) {
      System.out.println("Seu saldo é de " + saldo + " reais");
    } else {
      System.out.println("O cliente precisa estar registrado para ter saldo");
    }
  }
  
  
  
  
  private void modificaTaxaSaque() {
    if (saldo<=1000) {
      taxaSaque = 3.0;
    }
    if (saldo>1000 && saldo<=10000) {
      taxaSaque = 3.5;
    }
    if (saldo>10000) {
      taxaSaque = 4.0;
    }
  }
}
