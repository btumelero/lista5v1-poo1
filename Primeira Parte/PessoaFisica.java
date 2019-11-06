/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula4;

/**
 *
 * @author Bruno
 */
public class PessoaFisica extends Cliente{
  protected String cpf;
  

  public void setCpf(String cpf) {
    int digito, cont=0;
    char letra;
    int[] vetorCpf = {0,0,0,0,0,0,0,0,0,0,0};
    
    for (int c=0; c<14; c++) {
      if (c!=3 && c!=7 && c!=11) {
        letra = cpf.charAt(c);
        vetorCpf[cont] = Character.getNumericValue(letra);
        cont++;
      }
    }
    for (int j=10; j<=11; j++) {
      digito=0;
      for (int i=j; i>=2; i--) {
        digito = digito + (vetorCpf[j-i]*i);
      }
      digito = digito % 11;
      if (digito==0 || digito==1) {
        if (vetorCpf[j-1]!=0) {
          System.out.println("Cpf inválido");
        }
      } 
      else {
        if (vetorCpf[j-1]!=11-digito) {
          System.out.println("Cpf inválido");
        }
      }
    }
    this.cpf = cpf;
  }
  
  public String getCpf() {
    return cpf;
  }
  
  PessoaFisica(int idade, String nome, String numeroConta) {
    super(idade, nome, numeroConta);
  }
}
