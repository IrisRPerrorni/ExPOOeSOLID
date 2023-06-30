package L7_Ex1;

import java.util.ArrayList;
import java.util.List;

public  class Pais {
    private String codigoIOS;
    private String nomePais;
    private double populacao;
    private double dimensao;

    public Pais(String codigoIOS, String nomePais, double populacao, double dimensao) {
        this.codigoIOS = codigoIOS;
        this.nomePais = nomePais;
        this.populacao = populacao;
        this.dimensao = dimensao;

    }

    public String getCodigoIOS() {
        return codigoIOS;
    }

    public void setCodigoIOS(String codigoIOS) {
        this.codigoIOS = codigoIOS;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }
    public double densidadePopulacional(){
        return populacao/dimensao;
    }
}
