package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    int code1, quant1, code2, quant2;
    double preco1, preco2;

   
    code1 = sc.nextInt();
    quant1 = sc.nextInt();
    preco1 = sc.nextDouble();
    code2 = sc.nextInt();
    quant2 = sc.nextInt();
    preco2 = sc.nextDouble();
    
    double valorPagar = (quant1 * preco1 + quant2 * preco2);
    System.out.printf("Você comprou %d unidade(s) da peça 1 e %d unidade(s) da peça 2, o valor total é de R$ %.2f%n", quant1, quant2, valorPagar);

    sc.close();

  }
}