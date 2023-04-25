import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int maiorIdade = 0, menorIdade = Integer.MAX_VALUE;
    for (int i = 1; i <= 15; i++) {
      System.out.println("insira a idade da pessoa");
      int idadeAtual = input.nextInt();
      if (maiorIdade < idadeAtual) {
        maiorIdade = idadeAtual;
      }
      if (menorIdade > idadeAtual) {
        menorIdade = idadeAtual;
      }
    }

    System.out.println("A maior idade entre o grupo é " + maiorIdade);
    System.out.println("A menor idade entre o grupo é " + menorIdade);

    input.close();
  }
}
