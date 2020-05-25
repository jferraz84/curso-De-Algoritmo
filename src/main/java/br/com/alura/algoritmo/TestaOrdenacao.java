package br.com.alura.algoritmo;

public class TestaOrdenacao {

    public static void main(String[] args) {

        Produto produtos[] = {

                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Cobalt", 57000),
                new Produto("New Civic", 35000)
        };

        //selectionSort(produtos, produtos.length);
        novoSort(produtos, produtos.length);
        imprime(produtos);

    }

        private static  void imprime(Produto[] produtos){
            for (Produto produto : produtos) {
                System.out.println(produto.getNome() + " custa R$ " + produto.getPreco());
            }
        }


    private static void novoSort(Produto[] produtos, int qtdDeElementos){
        for (int atual = 1; atual < qtdDeElementos ; atual++) {

            System.out.println("Estou na casa " +atual);

            int analise = atual;
            while (analise > 0 && produtos[analise].getPreco() < produtos[analise -1].getPreco()) {
                troca(produtos, analise, analise -1);
                analise--;
            }

        }
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
    }

    private static void troca(Produto[] produtos, int primeiro, int segundo) {
        System.out.println("Trocando " + primeiro + " com o " + segundo);

        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];
        System.out.println("Estou trocando " + primeiroProduto.getNome() + " por " + segundoProduto.getNome());

        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static void selectionSort(Produto[] produtos, int qtdDeElementos){
        for (int atual = 0; atual < qtdDeElementos -1; atual++) {
            System.out.println("Estou na casa " + atual);

            int menor = buscaMenor(produtos, atual, qtdDeElementos - 1);
            troca(produtos, atual, menor);
        }
        System.out.println("----------------------");
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


