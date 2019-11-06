/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recuperacaoprova;

/**
 *
 * @author bruno.191196
 */
public class RecuperacaoProva {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Carro carro = new Carro("marcaPneu1", "marcaPneu2", "marcaPneu3", "marcaPneu4", "00000000-0");
    Motocicleta motocicleta = new Motocicleta("marcaPneu1", "marcaPneu2","00000000-0");
    Mecanico mecanico = new Mecanico("Carro", "Bruno");
    
    mecanico.conserta(motocicleta);
    mecanico.conserta(carro);
  }
  
}
