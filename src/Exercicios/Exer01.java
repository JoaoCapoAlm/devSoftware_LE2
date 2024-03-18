package Exercicios;

import Helper.Prompt;

public class Exer01 {
    public static void Executar(){
        Prompt.imprimir("Exercício 01", true);
        Prompt.imprimir("Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário,", true);
        Prompt.imprimir("calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média.", true);

        var nums = new double[5];
        for(var i = 0; i < 5; i++){
            nums[i] = Prompt.lerDecimal("Digite um número", false);
        }

        double soma = 0;
        for (double num : nums) {
            soma += num;
        }

        Prompt.imprimir(String.format("Média: %.2f", (soma / 5)), true);
    }
}
