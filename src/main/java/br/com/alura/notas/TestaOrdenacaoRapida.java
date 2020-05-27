package br.com.alura.notas;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

public class TestaOrdenacaoRapida {

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

        ordena(notas, 0, notas.length);
        int encontrei = busca(notas, 0, notas.length, 8.3);
        if (encontrei >= 0 ) {
            System.out.println("Encontrei a nota em " + encontrei);
        } else {
            System.out.println("-----------------------");
            System.out.println("| Nota NÂO ENCONTRADA!|");
            System.out.println("-----------------------");
        }

        for (int atual = 0; atual < notas.length; atual++){
            Nota nota = notas[atual];
            System.out.println(nota.getAluno() + " = " + nota.getValor());
        }
    }

    private static int busca(Nota[] notas, int de, int ate, double buscando) {
        System.out.println("Buscando "+buscando + " entre " +de+ " e " +ate);

        if (de > ate){
            return -1;
        }

        int meio = (de + ate) /2;
        Nota nota = notas[meio];
        if (buscando == nota.getValor()){
            return meio;
        }
        if (buscando < nota.getValor()){
            return busca(notas, de, meio -1, buscando);
        }
        return busca(notas, meio + 1, ate, buscando);
    }

    private static void ordena(Nota[] notas, int de, int ate) {
        int elementos = ate - de;
        if(elementos > 1) {
            int posicaoDoPivo = particiona(notas, de, ate);
            ordena(notas, de, posicaoDoPivo);
            ordena(notas, posicaoDoPivo + 1, ate);
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
