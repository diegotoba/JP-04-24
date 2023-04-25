import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o valor do produto");
    double preco = input.nextDouble();

    System.out.println("selecione a forma de pagamento");
    System.out.println("1-A vista no dinheiro, debito ou pix");
    System.out.println("2-A vista no crédito");
    System.out.println("3-A prazo em 2x");
    System.out.println("4-A prazo em 3x");
    int pagamento = input.nextInt();

    switch (pagamento) {
      case 1:
        System.out.println("Valor a vista com desconto:" + (preco * .85));
        break;
      case 2:
        System.out.println("Valor a vista no credito com desconto:" + (preco * .9));
        break;
      case 3:
        System.out.println("Valor a prazo em 2x:" + (preco));
        System.out.println("cada parcela custará " + (preco / 2) + " reais");
        break;
      case 4:
        System.out.println("Valor a prazo em 3x:" + (preco * 1.1));
        System.out.println("cada parcela custará " + (preco * 1.1 / 3) + " reais");
        break;

    }
    input.close();
  }
}
