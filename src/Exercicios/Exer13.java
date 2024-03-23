package Exercicios;

import Helper.Prompt;

public class Exer13 {
    public static void Executar(){
        Prompt.imprimir("Exercício 13");
        Prompt.imprimir("Elabore um algoritmo que receba um número n e retorne um vetor com os n\n" +
                "primeiros termos da sequência de Fibonacci.");
        Prompt.imprimir("Exemplo: n = 8, vetor = {1, 1, 2, 3, 5, 8, 13, 21}");
        Prompt.linhaEmBranco();

        int n;
        do {
            n = Prompt.lerInteiro("Quantos números deve retornar? ", false);
        } while (n < 0);

        if(n == 0){
            Prompt.imprimir("{}");
        } else if (n == 1) {
            Prompt.imprimir("1");
        } else {
            var fibonacci = new int[n];
            fibonacci[0] = 1;
            fibonacci[1] = 1;
            for (var i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            Prompt.imprimirArray(fibonacci, false);
        }
    }
}
