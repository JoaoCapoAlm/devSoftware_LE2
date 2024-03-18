package Exercicios;

import Helper.Prompt;

public class Exer04 {
    public static void Executar(){
        Prompt.imprimir("Exercício 04", true);
        Prompt.imprimir("Elabore um programa que leia um vetor de 5 números digitados pelo usuário e uma variável\n" +
                "de um número n qualquer, depois mostre na tela o índice dos elementos que são inferiores a n.");
        Prompt.linhaEmBranco();

        var vetor = new double[5];
        for(var i = 0; i < 5; i++){
            vetor[i] = Prompt.lerDecimal("Posição " + i + ": ", false);
        }

        var indice = Prompt.lerInteiro("Digite o valor do índice: ", true);
        indice = indice >= 5 ? 4 : indice;

        if(indice > 0){
            var mensagem = "";
            var newLine = false;
            for (var i = 0; i <= indice; i++){
                if(i == indice){
                    mensagem = Double.toString(vetor[i]);
                    newLine = true;
                }
                else{
                    mensagem = vetor[i] + ", ";
                }
                Prompt.imprimir(mensagem, newLine);
            }
        } else
            Prompt.imprimir("Não valores antes do índice 0", true);
    }
}
