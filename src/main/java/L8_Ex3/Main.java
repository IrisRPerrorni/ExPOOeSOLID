package L8_Ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cardapio cardapio = new Cardapio();

        while (true){
            System.out.println("Selecione a opção desejada");
            System.out.println("1 - Adicionar prato no cardapio");
            System.out.println("2 - Exibir cardapio");
            System.out.println("3 - Excluir prato no cardapio");
            System.out.println("4 - Sair ");
            int num = scanner.nextInt();
            switch (num){
                case 1: // adicionar prato
                    System.out.println("Digite o nome do prato a adicionar");
                    String nome = scanner.nextLine();
                    ArrayList<String>ingredientes = new ArrayList<>();

                    while (true){
                        System.out.println("digite os ingredientes , ou digite S para sair");
                        String ingrediente = scanner.next();
                        if (ingrediente.equalsIgnoreCase("S")){
                            break;
                        }
                        ingredientes.add(ingrediente);
                    }
                    Prato prato = new Prato(nome,ingredientes);
                    cardapio.adicionarPrato(prato);
                    break;
                case 2: // exibir cardapio
                    System.out.println("----------Cardapio---------");
                    cardapio.exibirPratosdeComida();
                    break;
                case 3:
                    System.out.println("Digite o nome do prato que deseja excluir: ");
                    String removerPrato = scanner.nextLine();
                    cardapio.removerPratodecomida(removerPrato);
                    break;
                case 4:
                    System.out.println("Sair");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("opção invalida!!!!");
            }
        }
    }
}
