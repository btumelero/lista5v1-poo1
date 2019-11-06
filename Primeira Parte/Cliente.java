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
abstract public class Cliente extends Pessoa {
  TipoCliente tipo = TipoCliente.PADRAO;
  final String NUMERO_CONTA;
  
  Cliente(int idade, String nome, String numeroConta) {
    super(idade, nome);
    this.NUMERO_CONTA = numeroConta;
  }
}
