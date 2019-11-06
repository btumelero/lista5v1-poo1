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
public class Motocicleta extends Veiculo{
  private String marcaPneu1, marcaPneu2;
  
  @Override
  public void imprimeDados() {
    System.out.println("\nRegistro: " + getRegistro() +
                       "\nmarcaPneu1: " + marcaPneu1 +
                       "\nmarcaPneu2: " + marcaPneu2);
  }

  Motocicleta(String marcaPneu1, String marcaPneu2, String reg) {
    super(reg);
    this.marcaPneu1 = marcaPneu1;
    this.marcaPneu2 = marcaPneu2;
  }
}
