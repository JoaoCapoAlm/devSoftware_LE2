package Exercicios;

import Helper.Prompt;

public class Exer11 {
    public static void Executar(){
        Prompt.imprimir("Exercício 11");
        Prompt.imprimir("Elabore um algoritmo que calcule o produto escalar entre dois vetores de inteiros de tamanho igual a 5");
        Prompt.imprimir("Exemplo: {0, 2, 4, 6, 8}, {1, 3, 5, 7, 9} = 0*1 + 2*3 + 4*5 + 6*7 + 8*9 = 140");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite os valores do vetor");
        var vetor1 = new double[5];
        for(var i = 0; i < vetor1.length; i++){
            vetor1[i] = Prompt.lerDecimal("Vetor 1 - posição " + (i + 1) + ": ", false);
        }

        var vetor2 = new double[5];
        for(var i = 0; i < vetor2.length; i++){
            vetor2[i] = Prompt.lerDecimal("Vetor 2 - posição " + (i + 1) + ": ", false);
        }

        double calculo = 0;
        for(var i = 0; i < 5; i++){
            calculo += (vetor1[i] * vetor2[i]);
        }

        Prompt.imprimir("Produto escalar = " + calculo, true);
    }
}
