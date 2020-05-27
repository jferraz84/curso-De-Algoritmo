package br.com.alura.notas;

public class TestaPivota {
    public static void main(String[] args) {

        Nota[] notas = {
                new Nota("Andre ", 4),
                new Nota("Carlos", 8.5),
                new Nota("Ana", 10),
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Lucia", 9.3),
                new Nota("Paulo", 9),
                new Nota("Mariana", 5),
                new Nota("Guilherme", 7)
        };

        particiona(notas, 0, notas.length );

        for (int atual = 0; atual < notas.length; atual++){
            Nota nota = notas[atual];
            System.out.println(nota.getAluno() + " = " + nota.getValor());
        }

    }
    private static int particiona(Nota[] notas, int inicio, int termino) {
        int menores = 0;

        Nota pivo = notas[termino - 1];
        for(int analise = 0; analise < termino - 1; analise++) {
            Nota atual = notas[analise];
            if(atual.getValor() <= pivo.getValor()) {
                troca(notas, analise, menores);
                menores++;
            }
        }
        troca(notas, termino - 1, menores);
        return menores;
    }

    private static void troca(Nota[] notas, int de, int para) {
        Nota nota1 = notas[de];
        Nota nota2 = notas[para];
        notas[para] = nota1;
        notas[de] = nota2;
    }
}
