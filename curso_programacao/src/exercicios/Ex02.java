package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    double raio, pi = 3.14159;
    
    System.out.println("Digite o raio da circunferência:");
    raio = sc.nextDouble();
    
    double area = pi * Math.pow(raio, 2.0);
    
    
    System.out.printf("A área do círculo com raio %.2f é %.4f.%n", raio, area);
    
    sc.close();
  }  
}