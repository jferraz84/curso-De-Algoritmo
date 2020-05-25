package br.com.alura.algoritmo;

public class DescobriMenorSalario {

    public static void main(String[] args) {

        double salario[] = new double[4];

        salario[0] = 2200;
        salario[1] = 6000;
        salario[2] = 5000;
        salario[3] = 3200;


        int maiorSalario = 0;
        int menorSalario = 0;

        for (int atual = 0; atual < 4 ; atual++) {
            if (salario[atual] > salario[maiorSalario]){
                maiorSalario = atual;
            } else if (atual > salario[maiorSalario]) {
                menorSalario = atual;
            }
        }
        System.out.println("O maior salario é: " + salario[maiorSalario]);
        System.out.println("O menor salario é: " + salario[menorSalario]);

    }
}
