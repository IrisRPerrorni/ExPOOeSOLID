package L8_Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    private  ArrayList<Produto> produtos ;

    public Cadastro() {
        this.produtos = new ArrayList<Produto>();
    }

    public  ArrayList<Produto>getProdutos(){
        return produtos;
    }

    //adicionar produto na lista
     public void adicionar (Produto produto){

        produtos.add(produto);

    }
    // listar todos os objetos da lista
     public String listar(){
        int i = 1;
        String saida = "";
        for (Produto produto: produtos) {

            saida += produto.imprimir() +"\n";
        }
        return saida;
    }
    public boolean removerProduto(String nome){
        for (Produto remover : produtos) {
            if (remover.getNome().equalsIgnoreCase(nome)){
                produtos.remove(remover);
                System.out.println(nome + "Produto removido");
                return true;
            }

        }
        return false;


    }


}
