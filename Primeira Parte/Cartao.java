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
abstract public class Cartao {
  TipoCartao tipo = TipoCartao.NORMAL;
  final String NOME = "Bruno";
  
  Cartao(ContaBancaria conta) {
  }
}
