package br.com.alura.algoritmo;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private static int maisCaro(Produto[] produtos) {

        int maisCaro = 0;

        for (int atual = 0; atual < 5; atual++) {
            if (produtos[atual].getPreco() > produtos[maisCaro].getPreco()) {
                maisCaro = atual;

            }
        }
        return maisCaro;
    }

    private static int maisBarato(Produto[] produtos) {

        int maisBarato = 0;

        for (int atual = 0; atual < 5; atual++) {
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

    @Override
    public String toString() {
        return "Produto " +
                "nome = '" + nome + '\'' +
                ", preco = " + preco ;
    }
}

