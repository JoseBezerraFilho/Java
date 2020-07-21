package secao6_repeticoes.exercicios;

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int etanol = 0;
    int gasolina = 0;
    int diesel = 0;

    int tipoCombustivel = sc.nextInt();

    while ( tipoCombustivel != 4) {
      
      switch (tipoCombustivel) {
        case 1 :
          etanol = etanol + 1;
          break;
        case 2 : 
          gasolina = gasolina + 1;
          break;
        case 3 :
          diesel = diesel + 1;
          break;
        default:
          System.out.println("Código inválido!");
          break;
      }
      tipoCombustivel = sc.nextInt();
    }

    System.out.println("Muito Obrigado.");
    System.out.println("Etanol: " + etanol);
    System.out.println("Gasolina: " + gasolina);
    System.out.println("Diesel: " + diesel);

    sc.close();
  }
}