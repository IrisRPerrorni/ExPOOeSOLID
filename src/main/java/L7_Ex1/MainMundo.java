package L7_Ex1;

public class MainMundo {
    public static void main(String[] args) {
        Pais brasil = new Pais("BRA" , "Brasil" ,214000000.3,8510000);
        Pais uruguai = new Pais("UYI" , "Uruguai" ,3000000.426,176215);
        Pais chile = new Pais("CLP","Chile", 19000000.49,756626);
        Pais argentina = new Pais("ARG" , "Argentina", 45000000.81,2780000);

        Fronteiras vizinhoBrasil = new Fronteiras();
        Fronteiras vizinhoargentina = new Fronteiras();


        //adicionar paises vizinhos Brasil
        vizinhoBrasil.adicionarPaisFronteira(argentina);
        vizinhoBrasil.adicionarPaisFronteira(uruguai);

        //adicionar paises vizinhos Argentina
        vizinhoargentina.adicionarPaisFronteira(uruguai);
        vizinhoargentina.adicionarPaisFronteira(chile);
        vizinhoargentina.adicionarPaisFronteira(brasil);

        System.out.println("\n======Verificando Paises que fazem fronteiras====\n");

        //verificar se os paises fazem fronteiras
        System.out.println("Brasil e Uruguai: " + vizinhoBrasil.verificarPaisFronteira(uruguai));
        System.out.println("\nBrasil e Chile: " + vizinhoBrasil.verificarPaisFronteira(chile));
        System.out.println("\nBrasil e Argentina: "+ vizinhoBrasil.verificarPaisFronteira(argentina));

        System.out.println("\n======Calculo da densidade dos Paises====\n");
        //calcula a densidade dos Paises
        System.out.println("Densidade do Brasil " + brasil.densidadePopulacional() );
        System.out.println("\nDensidade do Uruguai " + uruguai.densidadePopulacional());
        System.out.println("\nDensidade do Chile " + chile.densidadePopulacional());
        System.out.println("\nDensidade da Argentina " + argentina.densidadePopulacional());





    }

}
