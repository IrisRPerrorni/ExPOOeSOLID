package L8_Ex2;

public class Candidato implements Imprimir {
   private String nome;
   private int matricula;
   private double nota;

    public Candidato(String nome, int matricula, double nota) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }


    @Override
    public String imprimir() {
        return "Nome Candidato: " + nome + " Matricula: " + matricula + " Nota: " + nota;
    }
}
