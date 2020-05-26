package br.com.alura.notas;

public class TestaEncontraMenores {

    public static void main(String[] args) {

        Nota[] notas = {
                new Nota("Andre ", 4),
                new Nota("Carlos", 8.5),
                new Nota("Ana", 10),
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Guilherme", 7),
                new Nota("Paulo", 9),
                new Nota("Mariana", 5),
                new Nota("Lucia", 9.3)
        };

        int menores = buscaMenores(busca, notas);
        System.out.println("Numero de noats menores: " + menores);
    }
    
    private static int buscaMenores(Nota busca, Nota[] notas) {

        int menores = 0;
        for(Nota nota : notas) {
            if(nota.getValor() < busca.getValor()) {
                menores++;
            }
        }
        return menores;
    }
}
