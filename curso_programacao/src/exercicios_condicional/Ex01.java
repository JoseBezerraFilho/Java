package exercicios_condicional;

import java.util.Locale;
import java.util.Scanner;



public class Ex01 {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int numero = sc.nextInt();

    // if (numero > 0) {
    //   System.out.println("Positivo");
    // } else if (numero < 0) {
    //   System.out.println("Negativo");
    // } else {
    //   System.out.println("Neutro");
    // }

    String resultado = (numero > 0) ? "Positivo" : "Negativo";
    System.out.println(resultado);  

    sc.close();
  }
}