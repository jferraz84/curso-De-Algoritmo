package br.com.alura.notas;

public class TestaMerge {

    public static void main(String[] args) {

        Nota[] notas1 = {
                new Nota("Andre ", 4),
                new Nota("Mariana", 5),
                new Nota("Paulo", 9),
                new Nota("Carlos", 8.5)
        };

        Nota[] notas2 = {
                new Nota("Jonas", 3),
                new Nota("Juliana", 6.7),
                new Nota("Guilherme", 7),
                new Nota("Lucia", 9.3),
                new Nota("Ana", 10)
        };

        Nota[] rank = intercala(notas1, notas2);
            System.out.println("As notas dos alunos são: ");

        for ( Nota nota : rank) {
            System.out.println(nota.getAluno() + " = " + nota.getValor());
        }

    }

    private static Nota[] intercala(Nota[] notas1, Nota[] notas2) {
        int total = notas1.length + notas2.length;
        Nota[] resultado = new Nota[total];

        int atualNotas1 = 0;
        int atualNotas2 = 0;
        int atual = 0;


        while (atualNotas1 < notas1.length && atualNotas2 < notas2.length){

            Nota nota1 = notas1[atualNotas1];
            Nota nota2 = notas2[atualNotas2];

            if (nota1.getValor() < nota2.getValor()){
                resultado[atual] = nota1;
                atualNotas1++;
            }else {
                resultado[atual] = nota2;
                atualNotas2++;
            }
            atual++;
        }
        while (atualNotas2 < notas2.length){
            resultado[atual] = notas2[atualNotas2];
            atual++;
            atualNotas2++;
        }
        return resultado;

    }
}
