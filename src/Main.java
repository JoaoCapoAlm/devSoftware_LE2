import Exercicios.*;
import Helper.Prompt;

public class Main {
    public static void main(String[] args) {
        MostrarMenu();

        var executar = true;
        while (executar) {
            switch (Prompt.lerInteiro("Escolha uma opçao: ", false)) {
                case 1 -> Exer01.Executar();
                case 2 -> Exer02.Executar();
                case 3 -> Exer03.Executar();
                case 4 -> Exer04.Executar();
                case 5 -> Exer05.Executar();
                case 6 -> Exer06.Executar();
                case 7 -> Exer07.Executar();
                case 8 -> Exer08.Executar();
                case 9 -> Exer09.Executar();
                case 10 -> Exer10.Executar();
                case 11 -> Exer11.Executar();
                default -> Prompt.imprimirErro("Opção inválida!", true);
            }

            Prompt.separador();
            Prompt.linhaEmBranco();

            var voltarMenu = true;
            while (voltarMenu) {
                var optVoltarMenu = Prompt.lerLinha("Deseja voltar ao menu? (S)im ou (N)ão?");
                if (optVoltarMenu.equalsIgnoreCase("S")) {
                    voltarMenu = false;
                    MostrarMenu();
                } else if (optVoltarMenu.equalsIgnoreCase("N")) {
                    executar = false;
                    voltarMenu = false;
                } else {
                    Prompt.imprimirErro("Opção inválida!", true);
                }
            }
        }

        Prompt.pressionarEnter();
    }

    public static void MostrarMenu() {
        Prompt.separador();
        Prompt.imprimir("Menu", true);
        Prompt.imprimir("1 - Exercício 01 - Média de elementos do vetor", true);
        Prompt.imprimir("2 - Exercício 02 - Elementos de vetor", true);
        Prompt.imprimir("3 - Exercício 03 - Dobro de cada item", true);
        Prompt.imprimir("4 - Exercício 04 - Elementos menores que n", true);
        Prompt.imprimir("5 - Exercício 05 - Elementos repetidos", true);
        Prompt.imprimir("6 - Exercício 06 - Média ponderada", true);
        Prompt.imprimir("7 - Exercício 07 - Igualdade de vetores", true);
        Prompt.imprimir("8 - Exercício 08 - Concatenação de vetores", true);
        Prompt.imprimir("9 - Exercício 09 - Juntando valores", true);
        Prompt.imprimir("10 - Exercício 10 - Invertendo vetor", true);
        Prompt.imprimir("11 - Exercício 11 - Produto escalar", true);
        Prompt.imprimir("12 - Exercício 12 - ", true);
        Prompt.imprimir("13 - Exercício 13 - ", true);
        Prompt.imprimir("14 - Exercício 14 - ", true);
        Prompt.imprimir("15 - Exercício 15 - ", true);
        Prompt.separador();
        Prompt.linhaEmBranco();
    }
}