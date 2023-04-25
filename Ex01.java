import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Bem vindo ao menu. Selecione uma opçao");
    System.out.println("1-fim 2-cadastro 3-consulta");
    int escolha = input.nextInt();

    switch (escolha) {
      case 1:
        System.out.println("você finalizou o atendimento");
        break;
      case 2:
        System.out.println("Voce selecionou o cadastro");
        break;
      case 3:
        System.out.println("voce selecionou a consulta");
        break;
      default:
        System.out.println("opcao inválida");
    }
    input.close();
  }

}