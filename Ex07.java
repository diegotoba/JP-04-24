import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int continuar = 1;
    Integer maior = 0, menor = Integer.MAX_VALUE;
    ArrayList<Integer> pares = new ArrayList<>();
    while (continuar == 1) {
      System.out.println("Insira um número");
      Integer numero = input.nextInt();
      numeros.add(numero);

      System.out.println("gostaria de adicionar outro numero?");
      System.out.println("1-sim 2-não");
      continuar = input.nextInt();
    }
    for (Integer i : numeros) {
      if (i > maior) {
        maior = i;
      }
      if (i < menor) {
        menor = i;
      }
      if (i % 2 == 0) {
        pares.add(i);
      }
    }

    System.out.println("O maior numero digitado é " + maior);
    System.out.println("O menor numero digitado é " + menor);
    System.out.println("os  numeros pares são " + pares.toString());

    input.close();
  }

}
