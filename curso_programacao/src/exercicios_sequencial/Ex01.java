package exercicios_sequencial;
import java.util.Scanner;

public class Ex01 {

  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int soma = a + b;

    sc.close();
    System.out.println("A soma dos números inteiros são: " + soma);
    
  }

  
}