package br.com.alura.notas;

public class OrdenacaoDeString {
    public static void main(String[] args) {

        String[] nomes = {
                "Andressa",
                "Camila",
                "Enzo",
                "Fernando",
                "Maria",
                "Alberto",
                "Jonas",
                "Junior",
                "Paloma",
                "Paulo"
        };

        String[] nome = intercala(nomes, 0, 4, nomes.length);
        System.out.println("OS nomes ordenados são: ");
        for (String string : nome) {
            System.out.println(nomes);
        }
    }

    private static String[] intercala(String[] nomes, int inicio, int meio, int termino) {
        //String[] resultado = new String[termino - inicio];

        int total = termino - inicio;
        String[] resultado = new String[total];
        int atual = 0;
        int atual1 = inicio;
        int atual2 = meio;

        while(atual1 < meio && atual2 < termino) {
            String nome1 = nomes[atual1];
            String nome2 = nomes[atual2];
            if(nome1.compareTo(nome2) < 0) {
                resultado[atual] = nome1;
                atual1++;
            } else {
                resultado[atual] = nome2;
                atual2++;
            }
            atual++;
        }

        while(atual1 < meio) {
            resultado[atual] = nomes[atual1];
            atual1++;
            atual++;
        }

        while(atual2 < termino) {
            resultado[atual] = nomes[atual2];
            atual2++;
            atual++;
        }

        for (int contador = 0; contador < atual; contador++) {
            nomes[inicio + contador] = resultado[contador];
        }
        return nomes;
    }
}
