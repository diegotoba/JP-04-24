import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int escolha = 2;

    while (escolha == 2) {
      System.out.println("Selecione a opção desejada");
      System.out.println("1-finalizar 2-calcular raiz");
      escolha = input.nextInt();
      if (escolha == 1) {
        break;
      }
      System.out.println("digite um numero real");
      double numero = input.nextDouble();
      if (numero < 0) {
        System.out.println("Erro: não é possível  calcular a raiz");
      } else {
        System.out.println("a raiz quadrada de " + numero + "  é " + (Math.sqrt(numero)));
      }
    }

    System.out.println("Programa finalizado");
    input.close();
  }
}
