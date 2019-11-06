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
public class Triangulo extends Forma {
  final double altura, largura;
  
  public double hipotenusa() {
    double hipotenusa;
    hipotenusa = altura*altura + largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa;
  }
  
  @Override
  public double perimetro() {
    double hipotenusa;
    hipotenusa = altura*altura+largura*largura;
    hipotenusa = Math.sqrt(hipotenusa);
    return hipotenusa+altura+largura;
  }
  
  @Override
  public double area() {
    return altura*largura/2.0;
  }
  
  Triangulo(double altura, double largura, double x, double y) {
    super(x, y);
    this.altura = altura;
    this.largura = largura;
  }
}
