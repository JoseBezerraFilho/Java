package secao6_repeticoes.exercicios;

import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      int x = sc.nextInt();
      int y = sc.nextInt();

      if ( y != 0 ) {

        double div = (double) x / y;
        System.out.printf("%.1f%n",div);

      } else {

        System.out.println("Divisão impossível");
      }
    }

    sc.close();
    
  }
}