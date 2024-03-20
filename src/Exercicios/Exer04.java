package Exercicios;

import Helper.Prompt;

public class Exer04 {
    public static void Executar(){
        Prompt.imprimir("Exercício 04", true);
        Prompt.imprimir("""
                Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma
                variável de um número n qualquer, depois mostre na tela o índice dos elementos que
                são inferiores a n.""", true);
        Prompt.linhaEmBranco();

        var vetor = new double[5];

        for(var i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerDecimal("Digite o número: ", false);
        }

        var num = Prompt.lerDecimal("Digite o número de corte: ", false);

        for (double elemento : vetor) {
            if (elemento < num)
                Prompt.imprimir(elemento);
        }
    }
}
