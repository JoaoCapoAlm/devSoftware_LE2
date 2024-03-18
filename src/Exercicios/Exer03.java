package Exercicios;

import Helper.Prompt;

public class Exer03 {
    public static void Executar(){
        Prompt.imprimir("Exercício 03", true);
        Prompt.imprimir("Faça um programa que leia em um vetor uma sequência finita de números digitados pelo usuário.", true);
        Prompt.imprimir("Crie um segundo vetor que armazene o dobro de cada número do primeiro vetor e depois apresente os valores deste vetor.", true);
        Prompt.linhaEmBranco();

        var qtd = Prompt.lerInteiro("Quantos números terá o vetor? ", false);

        var vetor = new double[qtd];
        var vetorDobro = new double[qtd];

        for(var i = 0; i < qtd; i++){
            vetor[i] = Prompt.lerDecimal("Digite o número: ", false);
            vetorDobro[i] = 2 * vetor[i];
        }

        Prompt.imprimirArray(vetor, false);
        Prompt.imprimirArray(vetorDobro, false);
    }
}
