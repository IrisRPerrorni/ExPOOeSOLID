package L8_Ex3;

import java.util.ArrayList;

public class Cardapio {
    private ArrayList<Prato> cardapio;

    public Cardapio() {
        this.cardapio = new ArrayList<Prato>();
    }
    public void adicionarPrato(Prato prato){
        cardapio.add(prato);
    }
    public void exibirPratosdeComida(){
        for (Prato listar: cardapio) {
            System.out.println("Nome: " + listar.getNomeDoPrato());
            System.out.println("ingredientes: " + listar.getIngredientesDoPrato());
            System.out.println("\n++++++++++++++++\n");

        }
    }
    public boolean removerPratodecomida(String nomedoprato){
        for (Prato remover: cardapio) {
            if (remover.getNomeDoPrato().equalsIgnoreCase(nomedoprato)){
                cardapio.remove(remover);
                System.out.println("o Prato " + nomedoprato);
                System.out.println("Prato: " + nomedoprato + " removido ");
                return true;
            }

        }
        System.out.println("O prato solicitado não foi encontrado no cardapio! , não é possivel remover");
        return false;
    }

}
