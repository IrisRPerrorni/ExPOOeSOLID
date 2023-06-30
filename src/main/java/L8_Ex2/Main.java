package L8_Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CadastroCandidato cadastroCandidato = new CadastroCandidato();

        System.out.println("Digite quantos candidatos deseja cadastrar");
        int num = entrada.nextInt();


        for (int i = 0 ; i<num ; i++){
            System.out.println("Digite o nome do candidato: ");
            String nome = entrada.next();
            System.out.println();
            System.out.println("Digite a matricula do candidato: ");
            int matricula = entrada.nextInt();
            System.out.println("Digite a nota do candidato: ");
            double nota = entrada.nextDouble();
            Candidato candidato = new Candidato(nome,matricula,nota);
            cadastroCandidato.adicionar(candidato);
        }
        System.out.println("\nexibir lista\n");
        System.out.println(cadastroCandidato.exibirListaCandidatos());

        System.out.println("\nRemover Candidato\n");
        System.out.println("Digite o candidato que deseja remover");
        int remove = entrada.nextInt();
        cadastroCandidato.excluirCandidato(remove);

        System.out.println("\nexibir lista\n");
        System.out.println(cadastroCandidato.exibirListaCandidatos());

    }
}
