package L8_Ex2;

import L8_Ex1.Produto;

import java.util.ArrayList;

public class CadastroCandidato  {

    private ArrayList<Candidato> listaCandidatos;

    public CadastroCandidato() {

        this.listaCandidatos = new ArrayList<Candidato>();
    }

    public ArrayList<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }
    public void adicionar (Candidato candidato){

        listaCandidatos.add(candidato);

    }

    public boolean excluirCandidato(int matricula){
        for (Candidato lista : listaCandidatos) {
            if (lista.getMatricula() == matricula){
                listaCandidatos.remove(lista);
                return true;
            }

        }
        return false;
    }
    public String exibirListaCandidatos(){
        int i = 1;
        String saida = "";
        for (Candidato lista : listaCandidatos) {
            saida += lista.imprimir() +"\n";

        }
        return saida;
    }

}
