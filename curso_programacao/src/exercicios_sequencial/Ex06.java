package exercicios_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double A, B, C, pi = 3.14159, triangulo, circulo, trapezio, quadrado, retangulo ;

    System.out.println("Digite o valor de A:");
    A = sc.nextDouble();
    System.out.println("Digite o valor de B:");
    B = sc.nextDouble();
    System.out.println("Digite o valor de C:");
    C = sc.nextDouble();

    triangulo = (A * C) / 2;  
    circulo = pi * Math.pow(C, 2);
    trapezio = ((A + B) * C)/2;
    quadrado = Math.pow(B, 2);
    retangulo = A * B;

    System.out.printf("A área do trinângulo, círculo, trapézio, quadrado e retângulo são respectivamente: %.3f, %.3f, %.3f, %.3f, %.3f. %n", triangulo, circulo, trapezio, quadrado, retangulo );

    sc.close();

  }
  
}