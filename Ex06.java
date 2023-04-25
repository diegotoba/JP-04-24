import java.util.HashMap;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    HashMap<String, int[]> pessoa = new HashMap<>();
    int escolha = 0;
    String primeiroNome = "null";

    while (escolha <= 1) {
      String nome;
      int idade, sexo;
      System.out.println("Digite o nome da pessoa");
      nome = input.nextLine();
      System.out.println("Digite a idade da pessoa");
      idade = input.nextInt();
      System.out.println("Selecione o sexo da pessoa");
      System.out.println("1-masculino 2-feminino");
      sexo = input.nextInt();
      int dados[] = { 0, 0 };
      dados[0] = idade;
      dados[1] = sexo;
      pessoa.put(nome, dados);
      if (escolha == 0) {
        primeiroNome = nome;
      }

      System.out.println("Deseja adicionar mais uma pessoa?");
      System.out.println("1-sim 2-não");
      escolha = input.nextInt();
      input.nextLine();
    }
    System.out.println("Os homens com menos de 21 anos são:");
    for (String i : pessoa.keySet()) {
      if (pessoa.get(i)[1] == 1 && pessoa.get(i)[0] < 21) {
        System.out.println(i);
      }
    }
    System.out.println("O nome e idade das mulheres são:");
    for (String i : pessoa.keySet()) {
      if (pessoa.get(i)[1] == 2) {
        System.out.println(i + " " + pessoa.get(i)[0]);
      }
    }
    System.out.println("O nome, idade e sexo das pessoas mais velhas que " + primeiroNome);
    for (String i : pessoa.keySet()) {
      if (pessoa.get(i)[0] > pessoa.get(primeiroNome)[0]) {
        System.out.println("nome: " + i + " idade: " + pessoa.get(i)[0] + " sexo: " + pessoa.get(i)[1]);
      }
    }
    input.close();
  }
}
