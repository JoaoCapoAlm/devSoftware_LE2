package Exercicios;

import Helper.Prompt;

public class Exer05 {
    public static void Executar(){
        Prompt.imprimir("Exercício 05", true);
        Prompt.imprimir("Elabore um programa que leia 5 números do teclado e os armazene em um vetor.", true);
        Prompt.imprimir("Em seguida, leia um número n qualquer e apresente na tela a quantidade de vezes\n" +
                "que o número n aparece no vetor.", true);
        Prompt.linhaEmBranco();

        var vetor = new double[5];
        for(var i = 0; i < 5; i++){
            vetor[i] = Prompt.lerDecimal("Posição " + i + ": ", false);
        }

        var num = Prompt.lerInteiro("Digite o valor que deseja verificar: ", true);
        var repeticao = 0;
        for (double v : vetor) {
            if (v == num)
                repeticao++;
        }
        Prompt.imprimir("O número " + num + " aparece " + repeticao, true);
    }
}
