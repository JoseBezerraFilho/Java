package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double coordX = sc.nextDouble();
    double coordY = sc.nextDouble();

    if ( coordX == 0.0 && coordY == 0) {
      System.out.println("Origem");
    } else if (coordX == 0.0) {
      System.out.println("Eixo Y");
    } else if (coordY == 0) {
      System.out.println("Eixo X");
    } else if (coordX > 0.0 && coordY > 0.0) {
      System.out.println("Q1");
    } else if (coordX < 0.0 && coordY > 0.0) {
      System.out.println("Q2");
    } else if (coordX < 0.0 && coordY < 0.0) {
      System.out.println("Q3");
    } else {
      System.out.println("Q4");
    }

    sc.close();

  }
}