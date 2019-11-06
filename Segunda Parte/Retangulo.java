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
public class Retangulo extends Forma {
  final double largura, altura;
  
  @Override
  public double perimetro() {
    return largura*2 + altura*2;
  }
  
  @Override
  public double area() {
    return largura*altura;
  }
  
  Retangulo(double largura, double altura, double x, double y) {
    super(x, y);
    this.largura = largura;
    this.altura = altura;
  }
}
