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
abstract public class Veiculo {
  private String registro;
  protected boolean funcionando=false;
  
  public void imprimeDados(){
  }
  
  public String getRegistro(){
    return registro;
  }
  
  private boolean validaRegistro(String reg) {
    if (reg.length()==10) {
      for (int i=0; i<10; i++) {
        if (i==8) {
          if (reg.charAt(8)!= '-') {
            return false;
          }
        } else {
          if (!Character.isDigit(reg.charAt(i)) || (reg.charAt(i)<'0' && reg.charAt(i) >'9')) {
            return false;
          }
        }
      }
      return true;
    } else {
      return false;
    }
  }
  
  Veiculo(String registro) {
    if (validaRegistro(registro)==true) {
      this.registro = registro;
    } else {
      System.out.println("Registro Inválido");
    }
  }
}
