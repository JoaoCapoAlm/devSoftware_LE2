package Exercicios;

import Helper.Prompt;

import java.util.Arrays;

public class Exer14 {
    public static void Executar(){
        Prompt.imprimir("Exercício 14");
        Prompt.imprimir("""
                Faça um programa que leia um vetor de 5 elementos e, após a leitura, posicione
                o maior elemento na última posição do vetor. Nenhum número do vetor pode ser
                apagado ou duplicado. Apresente o vetor atualizado na tela""");
        Prompt.linhaEmBranco();

        var vetor = new double[5];
        int indexMaior = 0;
        for(var i = 0; i < vetor.length; i++){
            vetor[i] = Prompt.lerInteiro("Insira um valor: ", false);

            if(vetor[i] > vetor[indexMaior])
                indexMaior = i;
        }

        if(indexMaior < 4){
            double aux = vetor[indexMaior];
            for(var i = indexMaior; i < 4; i++){
                vetor[i] = vetor[i + 1];
            }
            vetor[4] = aux;
        }

        Prompt.imprimirArray(vetor, false);
    }
}
