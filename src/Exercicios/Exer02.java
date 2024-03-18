package Exercicios;

import Helper.Prompt;

public class Exer02 {
    public static void Executar(){
        Prompt.imprimir("Exercício 02", true);
        Prompt.imprimir("Escreva um algoritmo que leia em um vetor uma sequência finita de números\n" +
                "digitados pelo usuário e, logo após, mostre o número de cada posição do vetor e se\n" +
                "ele é positivo, negativo ou zero.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Número: ", false);
        var tamanho = Prompt.lerInteiro("Qual será o tamanho do vetor?", true);
        var vetor = new double[tamanho];

        for(var i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerDecimal("Número: ", false);
        }

        for(var i = 0; i < vetor.length; i++){
            String tipo = "zero";
            if(vetor[i] < 0)
                tipo = "negativo";
            else if (vetor[i] > 0)
                tipo = "positivo";

            Prompt.imprimir("Posição " + i + ": " + vetor[i] + " é " + tipo, true);
        }
    }
}
