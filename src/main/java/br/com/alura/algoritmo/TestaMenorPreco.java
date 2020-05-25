package br.com.alura.algoritmo;

public class TestaMenorPreco {

    public static void main(String[] args) {

        Produto produtos[] = {

                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Cobalt", 47000),
                new Produto("New Civic", 35000)
        };

        int maisBarato = buscaMenor(produtos, 0, 4);
        System.out.println("O carro " + produtos[maisBarato].getNome()
                                      + " é o mais barato, e custa R$ "
                                      + produtos[maisBarato].getPreco());
    }

    private static int buscaMenor(Produto[] produtos, int inicio, int termino) {

        int maisBarato = inicio;

        for (int atual = inicio; atual <= termino; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        return maisBarato;

    }
}
