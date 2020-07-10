package exercicios_sequencial;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B, C, D;
    System.out.println("Digite um inteiro A:");
    A = sc.nextInt();
    System.out.println("Digite um inteiro B:");
    B = sc.nextInt();
    System.out.println("Digite um inteiro C:");
    C = sc.nextInt();
    System.out.println("Digite um inteiro D:");
    D = sc.nextInt();

    int diferenca = (A * B - C * D);
    System.out.println("A diferença do produto de A e B pelo produto de C e D é: " + diferenca);

    sc.close();
  }
}