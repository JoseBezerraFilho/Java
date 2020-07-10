package exercicios_condicional;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int X = sc.nextInt();
    int Y = sc.nextInt();

    if ( X % Y == 0 || Y % X == 0) {
      System.out.println("São múltiplos.");
    } else {
      System.out.println("Não são múltiplos");
    }

    sc.close();

  }
}