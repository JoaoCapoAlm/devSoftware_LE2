package Exercicios;

import Helper.Prompt;

import java.util.Vector;

public class Exer07 {
    public static void Executar(){
        Prompt.imprimir("Exercício 07", true);
        Prompt.imprimir("Faça um programa que leia dois vetores de 5 elementos cada e verifique se eles são iguais ou não.", true);
        Prompt.imprimir("Para serem iguais, todos os elementos dos dois vetores devem coincidir.", true);
        Prompt.linhaEmBranco();

        var vetor1 = new double[5];
        var vetor2 = new double[5];
        for(var i = 0; i < vetor1.length; i++){
            vetor1[i] = Prompt.lerDecimal("Vetor 1 - posição " + (i + 1) + ": ", false);
        }

        for(var i = 0; i < vetor2.length; i++){
            vetor2[i] = Prompt.lerDecimal("Vetor 2 - posição " + (i + 1) + ": ", false);
        }

        boolean iguais = true;
        for(var i = 0; i < 5; i++){
            if(vetor1[i] != vetor2[i]){
                iguais = false;
                break;
            }
        }

        Prompt.imprimir("Os vetores são " + (iguais ? "iguais" : "diferentes"), true);
    }
}
