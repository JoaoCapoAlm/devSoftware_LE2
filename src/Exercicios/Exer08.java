package Exercicios;

import Helper.Prompt;

public class Exer08 {
    public static void Executar(){
        Prompt.imprimir("Exercício 08", true);
        Prompt.imprimir("""
                Dados dois vetores A e B de 5 elementos cada, criar um vetor C que representa a
                concatenação de A e B, ou seja, C contém os elementos de A seguidos dos elementos
                de B.""", true);
        Prompt.linhaEmBranco();

        var vetor1 = new double[5];
        var vetor2 = new double[5];
        for(var i = 0; i < vetor1.length; i++){
            vetor1[i] = Prompt.lerDecimal("Vetor 1 - posição " + (i + 1) + ": ", false);
        }

        for(var i = 0; i < vetor2.length; i++){
            vetor2[i] = Prompt.lerDecimal("Vetor 2 - posição " + (i + 1) + ": ", false);
        }

        var vetor3 = new double[10];
        for(var i = 0; i < vetor3.length; i++){
            if(i < 5)
                vetor3[i] = vetor1[i];
            else
                vetor3[i] = vetor2[i - 5];
        }

        Prompt.imprimirArray(vetor3, false);
    }
}
