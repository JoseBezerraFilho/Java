package exercicios_condicional;

import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int horaInicio = sc.nextInt();
    int horaFinal = sc.nextInt();
    int duracao;

    if ( horaFinal > horaInicio) {
      duracao = horaFinal - horaInicio;
    } else {
      duracao = (24 - horaInicio) + horaFinal;
    }

    System.out.printf("A duraçao do jogo é de %d horas.%n", duracao);

    sc.close();

  }
}