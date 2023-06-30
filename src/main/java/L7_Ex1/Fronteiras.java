package L7_Ex1;

import java.util.ArrayList;
import java.util.List;

public class Fronteiras {
    private List<Pais> fronteira;
    public Fronteiras(){
        this.fronteira = new ArrayList<Pais>();
    }
    public void adicionarPaisFronteira(Pais pais){
        fronteira.add(pais);
    }
    public boolean verificarPaisFronteira(Pais verificarFronteira){
        return fronteira.contains(verificarFronteira);
    }
}
