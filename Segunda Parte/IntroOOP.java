/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introoop;

/**
 *
 * @author darolt
 */
public class IntroOOP {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Folha folha = new Folha();
    Somador somador = new Somador();
    
    Retangulo ret1 = new Retangulo(10.0, 5.0, 1.0, 1.0);
    somador.adicionarForma(ret1);
    folha.adicionarForma(ret1);
    System.out.println("Área do retângulo 1: " + ret1.area());
    
    Triangulo tri = new Triangulo(10.0, 2.0, 1.0, 1.0);
    somador.adicionarForma(tri);
    folha.adicionarForma(tri);
    System.out.println("Área do Triângulo: " + tri.area());
    
    Circulo circ = new Circulo(5.0, 1.0, 1.0);
    somador.adicionarForma(circ);
    folha.adicionarForma(circ);
    System.out.println("Área do círculo: " + circ.area());
    
    Retangulo ret2 = new Retangulo(5.5, 9.5, 1.0, 1.0);
    somador.adicionarForma(ret2);
    folha.adicionarForma(ret2);
    System.out.println("Área do retângulo 2: " + ret2.area());
    
    System.out.println("Área total armazenada pelo somador: " + somador.area);
    System.out.println();
    
    Comparador comp = new Comparador();
    if (comp.comparaArea(ret1, tri)) {
      System.out.println("Area do retângulo é maior do que a do triângulo!");
    } else {
      System.out.println("Area do retângulo é menor do que a do triângulo!");
    }
    if (comp.comparaPerimetro(ret1, tri)) {
      System.out.println("Perimetro do retângulo é maior do que a do triângulo!");
    } else {
      System.out.println("Perimetro do retângulo é menor do que a do triângulo!");
    }
    
    if (comp.comparaArea(ret1, circ)) {
      System.out.println("Area do retângulo é maior do que a do círculo!");
    } else {
      System.out.println("Area do retângulo é menor do que a do círculo!");
    }
    if (comp.comparaPerimetro(ret1, circ)) {
      System.out.println("Perimetro do retângulo é maior do que a do círculo!");
    } else {
      System.out.println("Perimetro do retângulo é menor do que a do círculo!");
    }
    
    if (comp.comparaArea(tri, circ)) {
      System.out.println("Area do triângulo é maior do que a do círculo!");
    } else {
      System.out.println("Area do triângulo é menor do que a do círculo!");
    }
    if (comp.comparaPerimetro(tri, circ)) {
      System.out.println("Perimetro do triângulo é maior do que a do círculo!");
    } else {
      System.out.println("Perimetro do triângulo é menor do que a do círculo!");
    }
    
    System.out.println();
    System.out.println("Informações das formas armazenadas(ordenadas por tipo): ");
    folha.listarFormas();
    
    System.out.println();
    System.out.println("Informações das formas armazenadas(ordenadas por posição): ");
    folha.listarOrdenado();
  }
  
}