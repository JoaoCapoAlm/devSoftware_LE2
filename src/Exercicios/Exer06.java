package Exercicios;

import Helper.Prompt;

public class Exer06 {
    public static void Executar(){
        Prompt.imprimir("Exercício 06", true);
        Prompt.imprimir("Elabore um programa que leia um vetor com 5 notas de um aluno e um outro vetor\n" +
                "com 5 pesos e calcule a média ponderada do aluno.", true);
        Prompt.imprimir("Média ponderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)", true);
        Prompt.linhaEmBranco();

        var nota = new double[5];
        var peso = new double[5];
        double dividendo = 0;
        for(var i = 0; i < nota.length; i++){
            nota[i] = Prompt.lerDecimal("Nota " + (i + 1) + ": ", false);
            peso[i] = Prompt.lerDecimal("Peso " + (i + 1) + ": ", false);
            dividendo += (nota[i] * peso[i]);
        }

        double divisor = 0;
        for(double i : peso){
            divisor += i;
        }

        Prompt.imprimir("Média ponderada = " + (dividendo / divisor), true);
    }
}
