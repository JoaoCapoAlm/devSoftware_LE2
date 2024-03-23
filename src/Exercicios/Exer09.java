package Exercicios;

import Helper.Prompt;

public class Exer09 {
    public static void Executar(){
        Prompt.imprimir("Exercício 09", true);
        Prompt.imprimir("""
                Elabore um programa que leia os vetores A e B de 5 elementos e gere um vetor C
                de acordo com as seguintes regras:""", true);
        Prompt.imprimir("Os elementos das posições pares de C são os elementos das posições pares de A", true);
        Prompt.imprimir("Os elementos das posições ímpares de C são os elementos das posições ímpares de B;", true);
        Prompt.linhaEmBranco();

        var vetor1 = new double[5];
        var vetor2 = new double[5];
        for(var i = 0; i < vetor1.length; i++){
            vetor1[i] = Prompt.lerDecimal("Vetor 1 - posição " + (i + 1) + ": ", false);
        }

        for(var i = 0; i < vetor2.length; i++){
            vetor2[i] = Prompt.lerDecimal("Vetor 2 - posição " + (i + 1) + ": ", false);
        }

        var vetor3 = new double[5];
        for(var i = 0; i < vetor3.length; i++){
            vetor3[i] = ((i & 2) == 0) ? vetor1[i] : vetor2[i];
        }

        Prompt.imprimirArray(vetor3, false);
    }
}
