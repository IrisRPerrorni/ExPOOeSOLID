package L8_Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static void exibirMenu(){
        System.out.println("========== CadastroCandidato Produtos =========");
        System.out.println(" 1 - Cadastrar");
        System.out.println(" 2 - Listar");
        System.out.println(" 3 - Excluir Produto");
        System.out.println(" 4 - Sair");
        System.out.println(" Escolha uma opção");
    }
    public static void main(String[] args) {
        int menu;

        Scanner entrada = new Scanner(System.in);
        Cadastro cadastro = new Cadastro();
        do {
            exibirMenu();
             menu = entrada.nextInt();

            switch (menu){
                case 1: // cadastrar produto
                    System.out.println("Digite o produto");
                    String nome = entrada.next();
                    System.out.println("digite o preço em R$: ");
                    double preco = entrada.nextDouble();

                    Produto produto = new Produto(nome,preco);
                    cadastro.adicionar(produto);

                    break;

                case 2: // exibir a lista de produto
                    System.out.println("lista produtos");
                    System.out.println(cadastro.listar());
                    break;

                case 3: // excluir produto;
                    System.out.println("Informe o nome do produto que deseja remover");
                    String remove = entrada.next();
                    cadastro.removerProduto(remove);

                    break;

                case 4: //sair
                    System.out.println("saindo do comando");
                    System.exit(0);
                    break;

                default:
                    System.out.println("opção invalida");

            }

        } while ( menu !=5);






    }

}
