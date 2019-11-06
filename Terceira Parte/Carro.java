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
public class Carro extends Veiculo{
  private String marcaPneu1, marcaPneu2, marcaPneu3, marcaPneu4;
  
  @Override
  public void imprimeDados() {
    System.out.println("\nRegistro: " + getRegistro() +
                       "\nmarcaPneu1: " + marcaPneu1 +
                       "\nmarcaPneu2: " + marcaPneu2 +
                       "\nmarcaPneu3: " + marcaPneu3 +
                       "\nmarcaPneu4: " + marcaPneu4);
  }
  
  Carro (String marcaPneu1, String marcaPneu2, String marcaPneu3, String marcaPneu4, String reg) {
    super(reg);
    this.marcaPneu1 = marcaPneu1;
    this.marcaPneu2 = marcaPneu2;
    this.marcaPneu3 = marcaPneu3;
    this.marcaPneu4 = marcaPneu4;
  }
}
