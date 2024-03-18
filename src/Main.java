import Exercicios.Exer01;
import Helper.Prompt;

public class Main {
    public static void main(String[] args) {
        MostrarMenu();

        var executar = true;
        while (executar) {
            switch (Prompt.lerInteiro("Escolha uma opçao: ", false)) {
                case 1 -> Exer01.Executar();
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
        Prompt.imprimir("1 - Exercício 01 - ", true);
        Prompt.imprimir("2 - Exercício 02 - ", true);
        Prompt.imprimir("3 - Exercício 03 - ", true);
        Prompt.imprimir("4 - Exercício 04 - ", true);
        Prompt.imprimir("5 - Exercício 05 - ", true);
        Prompt.imprimir("6 - Exercício 06 - ", true);
        Prompt.imprimir("7 - Exercício 07 - ", true);
        Prompt.imprimir("8 - Exercício 08 - ", true);
        Prompt.imprimir("9 - Exercício 09 - ", true);
        Prompt.imprimir("10 - Exercício 10 - ", true);
        Prompt.imprimir("11 - Exercício 11 - ", true);
        Prompt.imprimir("12 - Exercício 12 - ", true);
        Prompt.imprimir("13 - Exercício 13 - ", true);
        Prompt.imprimir("14 - Exercício 14 - ", true);
        Prompt.imprimir("15 - Exercício 15 - ", true);
        Prompt.separador();
        Prompt.linhaEmBranco();
    }
}