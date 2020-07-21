package secao6_repeticoes.exercicios;

import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite sua senha:");
    int senha = sc.nextInt();

    while ( senha != 2202) {
      System.out.println("Senha inválida!");
      senha = sc.nextInt();
    }

    System.out.println("Acesso permitido.");


    sc.close();
  }
}