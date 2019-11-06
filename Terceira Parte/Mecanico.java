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
public class Mecanico extends Pessoa{
  private String especialidade;
  
  public void conserta(Veiculo veiculo) {
    if (veiculo.funcionando==true) {
      System.out.println("Veículo sem problemas - verificado por " + nome);
    } else {
      if ("Carro".equals(especialidade)) {
        if (veiculo instanceof Carro) {
          veiculo.funcionando=true;
          System.out.println("Carro consertado por " + nome);
        } else {
          System.out.println("Veículo não pôde ser consertado por " + nome);
        }
      } else {
        if (veiculo instanceof Motocicleta) {
          veiculo.funcionando=true;
          System.out.println("Motocicleta consertada por " + nome);
        } else {
          System.out.println("Veículo não pôde ser consertado por " + nome);
        }
      }
    }
  }
  
  Mecanico(String especialidade, String nome) {
    super(nome);
    this.especialidade = especialidade;
  }
}
