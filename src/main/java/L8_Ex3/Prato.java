package L8_Ex3;

import java.util.ArrayList;

public class Prato {
    private String nomeDoPrato;
    private ArrayList<String> ingredientesDoPrato;

    public Prato(String nomeDoPrato, ArrayList<String> ingredientesDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
        this.ingredientesDoPrato = ingredientesDoPrato;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public void setNomeDoPrato(String nomeDoPrato) {
        this.nomeDoPrato = nomeDoPrato;
    }

    public ArrayList<String> getIngredientesDoPrato() {
        return ingredientesDoPrato;
    }

    public void setIngredientesDoPrato(ArrayList<String> ingredientesDoPrato) {
        this.ingredientesDoPrato = ingredientesDoPrato;
    }
}
