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
public class Circulo extends Forma {
  final double raio;
  
  @Override
  public double area() {
    return raio*Math.PI;
  }
  
  @Override
  public double perimetro() {
    return 2*raio*Math.PI;
  }
  
  public double diametro() {
    return 2*raio;
  }
  
  Circulo(double raio, double x, double y) {
    super(x, y);
    this.raio = raio;
  }
}
