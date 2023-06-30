import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<String> agenda = new ArrayList<>(); // declarando e instanciando agenda de contato
        // usar metodo add para gravar 4 contatos
        agenda.add("juca");
        agenda.add("joao");
        agenda.add("maria");
        agenda.add("patricia");

        // mostrando "n" contato da agenda usando indice
        // numeros de elementos da agenda metodo size()

        System.out.println("Percorrendo o Arrylis usando o indice");
        int n = agenda.size();
        int i;
        for (i=0; i<n ; i++){
            System.out.println("Posicao " + i + agenda.get(i));
        }
        System.out.println("Informe a posicao a ser excluida");
        i = ler.nextInt();
        try {
            agenda.remove(i);
        }catch (IndexOutOfBoundsException e){
            //exceção lançada para indicar que um índice (i)
            //está fora do intervalo válido (de 0 até agenda.size()-1)
            System.out.println("posicao invalida");
            e.getMessage();
        }
        //mostrando os contatos da agenda usando for each
        System.out.println("Percorrendo arrylist usando for-each");
        i = 0;
        for (String contato:agenda) {
            System.out.println("Posicao: " + i + " Contato: " + contato);
            i ++;
        }
        // mostrando n contato da agenda com interator

        System.out.println("Percorrendo o Arraylis usando interatoor");
        i=0;
        Iterator<String>iterator = agenda.iterator();
        while (iterator.hasNext()){
            System.out.println("Posição: " + i + iterator.next());
            i++;
        }


        }

    }

