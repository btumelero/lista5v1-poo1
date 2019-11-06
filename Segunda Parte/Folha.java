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
public class Folha {
  private final double alturaFolha=30, larguraFolha=21;
  private int numeroRetangulo=0, numeroTriangulo=0, numeroCirculo=0, numeroTotal=0;
  Forma[] listaForma;
  
  public void adicionarForma(Forma forma) {
    forma.z=numeroTotal;
    if (forma instanceof Circulo) {
      if (((Circulo) forma).diametro()>larguraFolha || ((Circulo) forma).diametro()>alturaFolha) {
      System.out.println("O círculo não cabe na folha!");
      } else {
        if (forma.x<((Circulo) forma).raio || forma.y<((Circulo) forma).raio) {
          System.out.println("O círculo está fora da folha");
        } else {
          if (((Circulo) forma).raio>larguraFolha-forma.x || ((Circulo) forma).raio>alturaFolha-forma.y) {
            System.out.println("O círculo está fora da folha");
          } else {
            System.out.println("O círculo está dentro da folha");
          }
        }
      }
      listaForma[numeroTotal] = forma;
      System.out.println("listaForma[numeroTotal].z: " + listaForma[numeroTotal].z);
      numeroCirculo++;
      numeroTotal++;
    } else {
      if (forma instanceof Triangulo) {
        if (((Triangulo) forma).largura>larguraFolha || ((Triangulo) forma).altura>alturaFolha) {
          System.out.println("O triângulo não cabe na folha!");
        } else {
          if (((Triangulo) forma).largura>larguraFolha-((Triangulo) forma).x || ((Triangulo) forma).altura>((Triangulo) forma).y) {
            System.out.println("O triângulo está fora da folha");
          } else {
            System.out.println("O triângulo está dentro da folha");
          }
        }
        listaForma[numeroTotal] = forma;
        System.out.println("listaForma[numeroTotal].z: " + listaForma[numeroTotal].z);
        numeroTriangulo++;
        numeroTotal++;
      } else {
        if (((Retangulo) forma).largura>larguraFolha || ((Retangulo) forma).altura>alturaFolha) {
          System.out.println("O retângulo não cabe na folha!");
        } else {
          if (((Retangulo) forma).largura>larguraFolha-((Retangulo) forma).x || ((Retangulo) forma).altura>((Retangulo) forma).y) {
            System.out.println("O retângulo está fora da folha");
          } else {
            System.out.println("O retângulo está dentro da folha");
          }
        }
        listaForma[numeroTotal] = forma;
        System.out.println("listaForma[numeroTotal].z: " + listaForma[numeroTotal].z);
        numeroRetangulo++;
        numeroTotal++;
      }
    }
  }
  
  public void listarFormas() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Retangulo) {
        System.out.println("\nInformações do retângulo " + i + ":");
        System.out.println("Largura: " + ((Retangulo) listaForma[i]).largura + "\nAltura: " + ((Retangulo) listaForma[i]).altura);
        System.out.println("Perímetro: " + ((Retangulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Retangulo) listaForma[i]).area() + "\nPosição na folha: " + ((Retangulo) listaForma[i]).z);
      }
    }
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Triangulo) {
        System.out.println("\nInformações do triângulo " + i + ":");
        System.out.println("Largura: " + ((Triangulo) listaForma[i]).largura + "\nAltura: " + ((Triangulo) listaForma[i]).altura + "\nHipotenusa: " + ((Triangulo) listaForma[i]).hipotenusa());
        System.out.println("Perímetro: " + ((Triangulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Triangulo) listaForma[i]).area() + "\nPosição na folha: " + ((Triangulo) listaForma[i]).z);
      }
    }
    for (int i=0; i<numeroTotal; i++) {
      if (listaForma[i] instanceof Circulo) {
        System.out.println("\nInformações do círculo " + i + ":");
        System.out.println("Diâmetro: " + ((Circulo) listaForma[i]).diametro() + "\nRaio: " + ((Circulo) listaForma[i]).raio);
        System.out.println("Comprimento: " + ((Circulo) listaForma[i]).perimetro() + "\nÁrea: " + ((Circulo) listaForma[i]).area() + "\nPosição na folha: " + ((Circulo) listaForma[i]).z);
      }
    }
  }
  
  public void listarOrdenado() {
    System.out.println("Há " + numeroTotal + " de formas nesta lista, sendo que:");
    System.out.print(numeroRetangulo + " são retângulos, ");
    System.out.print(numeroTriangulo + " triângulos e ");
    System.out.println(numeroCirculo + " círculos");
    for (int a=0; a<numeroTotal; a++){
      if (a==listaForma[a].z && (listaForma[a] instanceof Retangulo)) {
        System.out.println("\nInformações do retângulo " + a + ":");
        System.out.println("Largura: " + ((Retangulo) listaForma[a]).largura + "\nAltura: " + ((Retangulo) listaForma[a]).altura);
        System.out.println("Perímetro: " + ((Retangulo) listaForma[a]).perimetro() + "\nÁrea: " + ((Retangulo) listaForma[a]).area() + "\nPosição na folha: " + ((Retangulo) listaForma[a]).z);
      } else {
        if (a==listaForma[a].z && (listaForma[a] instanceof Triangulo)) {
          System.out.println("\nInformações do triângulo " + a + ":");
          System.out.println("Largura: " + ((Triangulo) listaForma[a]).largura + "\nAltura: " + ((Triangulo) listaForma[a]).altura + "\nHipotenusa: " + ((Triangulo) listaForma[a]).hipotenusa());
          System.out.println("Perímetro: " + ((Triangulo) listaForma[a]).perimetro() + "\nÁrea: " + ((Triangulo) listaForma[a]).area() + "\nPosição na folha: " + ((Triangulo) listaForma[a]).z);
        } else {
          System.out.println("\nInformações do círculo " + a + ":");
          System.out.println("Diâmetro: " + ((Circulo) listaForma[a]).diametro() + "\nRaio: " + ((Circulo) listaForma[a]).raio);
          System.out.println("Comprimento: " + ((Circulo) listaForma[a]).perimetro() + "\nÁrea: " + ((Circulo) listaForma[a]).area() + "\nPosição na folha: " + ((Circulo) listaForma[a]).z);
        }
      }
    }
  }
  
  Folha() {
    listaForma = new Forma[10];
  }
}
