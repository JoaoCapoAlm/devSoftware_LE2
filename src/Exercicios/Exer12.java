package Exercicios;

import Helper.Prompt;

public class Exer12 {
    public static void Executar(){
        Prompt.imprimir("Exercício 12");
        Prompt.imprimir("Elabore um programa que leia um vetor de 12 elementos apresente na tela o\n" +
                "produto dos elementos pares positivos (desconsiderar o zero).");
        Prompt.imprimir("Exemplo: {0, 5, 8, 1, -6, 4, -7, 9, 10, -14, 3, 12} = 8 * 4 * 10 * 12 = 3840");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite os valores dos elementos do vetor");
        var vetor = new double[12];
        for(var i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerDecimal("Elemento " + (i + 1) + ": ", false);
        }

        double calculo = 1;
        for (double elemento : vetor) {
            if (elemento > 0 && elemento % 2 == 0) {
                calculo *= elemento;
            }
        }

        Prompt.imprimir("Resultado: " + calculo);
    }
}
