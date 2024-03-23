package Exercicios;

import Helper.Prompt;

public class Exer15 {
    public static void Executar(){
        Prompt.imprimir("Exercício 15");
        Prompt.imprimir("""
                Elabore um algoritmo que leia 5 números do teclado e preencha um vetor de
                acordo com a seguinte regra: com exceção do 1º número, só é permitido armazenar
                um número se ele for maior que o anterior. Ex.: se o primeiro valor lido for 5, o próximo
                valor lido só poderá ser maior que 5.""");
        Prompt.linhaEmBranco();

        var vetor = new double[5];
        for(var i = 0; i < vetor.length; i++){
            if(i == 0)
                vetor[i] = Prompt.lerInteiro("Digite o valor do elemento " + (i + 1), true);
            else {
                vetor[i] = Prompt.lerInteiro("Digite o valor do elemento " + (i + 1), true);
                while (vetor[i] <= vetor[i-1]){
                    Prompt.imprimirErro("O valor inserido deve ser maior que o anterior!", true);
                    vetor[i] = Prompt.lerInteiro("Digite o valor do elemento " + (i + 1), true);
                }
            }
        }

        Prompt.imprimirArray(vetor, false);
    }
}
