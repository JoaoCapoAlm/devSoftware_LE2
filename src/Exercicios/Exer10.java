package Exercicios;

import Helper.Prompt;

public class Exer10 {
    public static void Executar(){
        Prompt.imprimir("Exercício 10", true);
        Prompt.imprimir("""
                Crie um programa que leia um vetor A de 5 posições e, ao final da leitura, copie
                os elementos de A em B de forma invertida. Ou seja, o primeiro elemento de A é o
                último elemento de B, o segundo elemento de A é o penúltimo elemento de B, e assim
                por diante.""", true);
        Prompt.linhaEmBranco();

        var vetor1 = new double[5];
        for(var i = 0; i < vetor1.length; i++){
            vetor1[i] = Prompt.lerDecimal("Vetor 1 - posição " + (i + 1) + ": ", false);
        }

        var vetor2 = new double[5];
        int aux = 4;
        for(var i = 0; i < 5; i++){
            vetor2[i] = vetor1[aux];
            aux--;
        }

        Prompt.imprimirArray(vetor2, false);
    }
}
