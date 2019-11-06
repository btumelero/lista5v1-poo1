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
abstract public class Forma {
  final double x, y;
  int z;
  
  abstract public double area(); 
  
  abstract public double perimetro();
  
  Forma(double x, double y) {
    this.x = x;
    this.y = y;
  }
}
