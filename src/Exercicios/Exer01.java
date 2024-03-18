package Exercicios;

import Helper.Prompt;

public class Exer01 {
    public static void Executar(){
        Prompt.imprimir("Exercício 01", true);
        Prompt.imprimir("Construa um programa que leia em um vetor uma sequência de 5 números digitados pelo usuário,", true);
        Prompt.imprimir("calcule a média e apresente na tela quais valores são menores, iguais ou superiores à média.", true);

        var nums = new double[5];
        for(var i = 0; i < 5; i++){
            nums[i] = Prompt.lerDecimal("Digite um número: ", false);
        }

        double soma = 0;
        for (double num : nums) {
            soma += num;
        }
        var media = (soma / 5);

        Prompt.linhaEmBranco();
        Prompt.imprimir(String.format("Média: %.2f", media), true);
        var mensagem = "";
        for(var i = 0; i < nums.length; i++){
            mensagem = "Posição " + i + ": " + nums[i] + " ";
            if(nums[i] > media)
                Prompt.imprimir(mensagem + "a cima da média", true);
            else if (nums[i] < media)
                Prompt.imprimir(mensagem + "a baixo da média", true);
            else
                Prompt.imprimir(mensagem + "na média", true);
        }
    }
}
