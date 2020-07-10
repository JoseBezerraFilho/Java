package exercicios_condicional;

import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int numero = sc.nextInt();

    // if ( numero % 2 == 0) {
    //   System.out.println("Par");
    // } else {
    //   System.out.println("Ímpar");
    // }

    String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";
    System.out.println(resultado);

    sc.close();
  }
}