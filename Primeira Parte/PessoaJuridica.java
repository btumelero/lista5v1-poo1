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
public class PessoaJuridica extends Cliente{
  protected String cnpj;
  
  public void setCnpj(String cnpj) {
    //verificação aqui
    this.cnpj = cnpj;
  }
  
  PessoaJuridica(int idade, String nome, String numeroConta) {
    super(idade, nome, numeroConta);
  }
}
