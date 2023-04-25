import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double valorBase, horaExtra;

    System.out.println("Digite o valor nominal do salario");
    valorBase = input.nextDouble();
    System.out.println("Digite a quantidade de horas trabalhadas");
    horaExtra = input.nextDouble();

    double valorExtra = (valorBase / 176) * horaExtra * 1.5;
    double inss = (valorBase + valorExtra) * .1;
    if (inss >= 150) {
      inss = 150;
    }

    System.out.println("Seu salário base é de " + valorBase + " reais");
    System.out.println("Seu total a receber por horas extra é de " + valorExtra + " reais");
    System.out.println("o desconto do inss será de " + inss + " reais");
    System.out.println("Seu salário liquido sera de " + (valorBase + valorExtra - inss) + " reais");

    input.close();
  }
}
