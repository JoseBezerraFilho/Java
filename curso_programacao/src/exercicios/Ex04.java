package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite o id do funcionário:");
    int id_func = sc.nextInt();
    
    System.out.println("Digite a quantidade de horas trabalhadas:");
    int horas_trabalho = sc.nextInt();
    
    System.out.println("Digite o valor da hora trabalhada:");
    double valor_hora = sc.nextDouble();
    
    double salario = horas_trabalho * valor_hora;
    
    System.out.printf("O funcionário com registro %d trabalhou %d horas e receberá um salário de R$ %.2f.%n", id_func, horas_trabalho, salario);

    sc.close();

  }
}