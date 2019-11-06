/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author bruno.191196
 */
public class Comparador {
  Triangulo[] tris;
  
  public boolean comparaArea(Forma forma1, Forma forma2) {
    return forma1.area()>forma2.area();
  }
  
  public boolean comparaPerimetro(Forma forma1, Forma forma2) {
    return forma1.perimetro()>forma2.perimetro();
  }
  
  Comparador() {
    tris = new Triangulo[10];
  }
}