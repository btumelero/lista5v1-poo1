/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 * 1) se o set e o get já existem, é melhor usá-los ao invés de apagá-los e modificar onde já estão sendo usados
 * 
 * 2) modificar para protected, pois será mais prático do que criar os gets e sets e usá-los na subclasse.
 * mesmo que seja necessário criá-los e usá-los na main, ainda é melhor pois facilita para o programador, 
 * uma vez que é mais fácil usar exemplo.ex do que exemplo.ex()
 * 
 * 3) se o atributo não for usado na main é melhor que ele seja protegido e não tenha gets e sets,
 * pois assim o uso do atributo é facilitado uma vez que ele pode ser usado diretamente e não poderá ser
 * acessado da main
 * 
 * @author darolt
 */
public class Aula4 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    String valor;
    
    System.out.println("_________________________________conta 1______________________________________________________");
    PessoaFisica pessoaF1 = new PessoaFisica(18, "abc", "123");
    ContaBancaria conta1 = new ContaBancaria();
    CartaoDebito cartao1 = new CartaoDebito(conta1);
    pessoaF1.setCpf("044.418.410-43");
    conta1.registarCliente(pessoaF1);
    conta1.adicionarCartao(pessoaF1, cartao1);
    
    PessoaFisica pessoaF2 = new PessoaFisica(18, "bcd", "234");
    CartaoCredito cartao2 = new CartaoCredito(conta1);
    pessoaF2.setCpf("044.418.410-43");
    conta1.registarCliente(pessoaF2);
    conta1.adicionarCartao(pessoaF2, cartao2);
    
    System.out.println("__________________cliente 1________________");
    valor = "250";
    System.out.println("valor a ser depositado: " + valor);
    conta1.setDeposito(valor, pessoaF1);
    
    valor = "200";
    System.out.println("valor a ser sacado: " + valor);
    conta1.setSaque(valor, cartao1, pessoaF1);
    
    conta1.getHistorico(pessoaF1);
    
    conta1.getSaldo(pessoaF1);
    
    System.out.println("__________________cliente 2________________");
    valor = "250";
    System.out.println("valor a ser depositado: " + valor);
    conta1.setDeposito(valor, pessoaF2);
    
    valor = "200";
    System.out.println("valor a ser sacado: " + valor);
    conta1.setSaque(valor, cartao2, pessoaF2);
    
    conta1.getHistorico(pessoaF2);
    conta1.getSaldo(pessoaF2);
    
    System.out.println("_________________________________conta 2______________________________________________________");
    System.out.println("_____________________Cliente 1____________________");
    PessoaJuridica pessoaJ3 = new PessoaJuridica(18, "xyz", "456");
    ContaBancaria conta2 = new ContaBancaria();
    CartaoDebito cartao3 = new CartaoDebito(conta2);
    CartaoCredito cartao4 = new CartaoCredito(conta2);
    
    pessoaJ3.setCnpj("044.418.410-43");
    conta2.registarCliente(pessoaJ3);
    conta2.adicionarCartao(pessoaJ3, cartao3);
    conta2.adicionarCartao(pessoaJ3, cartao4);
    
    valor = "2000";
    System.out.println("valor a ser depositado: " + valor);
    conta2.setDeposito(valor , pessoaJ3);
    
    System.out.println("pagando 1000 reais de dividas da pessoaF3 usando o cartao3 para a conta 1");
    conta2.paga(pessoaJ3, cartao3, conta1, 1000);
    
    conta2.getHistorico(pessoaJ3);
    conta2.getSaldo(pessoaJ3);
    
    System.out.println("_________________________________conta 1______________________________________________________");
    System.out.println("Pagando dívidas dos cartões do cliente 1");
    conta1.pagaCartoes(pessoaF1);
    conta1.getHistorico(pessoaF1);
    conta1.getSaldo(pessoaF1);
  }
  
}
