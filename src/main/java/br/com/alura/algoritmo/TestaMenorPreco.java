package br.com.alura.algoritmo;

public class TestaMenorPreco {

    public static void main(String[] args) {

        Produto produtos[] = new Produto[5];

        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jioe", 46000);
        produtos[2] = new Produto("Brasilia", 16000);
        produtos[3] = new Produto("Cobalt", 47000);
        produtos[4] = new Produto("New Civic", 35000);


        produtos.toString();
            System.out.println("O mais caro é ");

    }
}
