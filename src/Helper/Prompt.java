package Helper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/**
 * Um classe utilitária para imprimir e ler textos, números inteiros e decimais
 * no prompt de comandos.
 *
 * @version 1.0 Mar 2023
 * @author Geucimar Briatore
 */
public class Prompt {
    /**
     * Imprime a mensagem enviada no console.
     */
    public static void imprimir(String mensagem, boolean newLine) {
        if(newLine)
            System.out.println(mensagem);
        else
            System.out.print(mensagem);
        System.out.flush();
    }

    /**
     * Imprime o objeto enviado no console.
     */
    public static void imprimir(Object object) {
        System.out.println(object);
        System.out.flush();
    }

    public static void imprimirArray(int[] array, boolean newLine){
        if(array == null){
            return;
        }
        for(var i : array){
            imprimir(String.valueOf(i), newLine);
        }
    }

    public static void imprimirArray(double[] vetor, boolean newLine){
        if(vetor == null)
            return;
        for (int i = 0; i < vetor.length; i++) {
            String mensagem = String.valueOf(vetor[i]);

            if (!newLine && i < vetor.length - 1)
                mensagem += ", ";
            else
                newLine = true;

            imprimir(mensagem, newLine);
        }
    }

    public static void imprimirErro(String mensagem, boolean newLine){
        if(newLine)
            System.err.println(mensagem);
        else
            System.err.print(mensagem);
        System.err.flush();
    }

    /**
     * Imprime uma linha separadora no console.
     */
    public static void separador() {
        imprimir("---------------------------------------------------", true);
    }

    /**
     * Imprime uma linha em branco no console.
     */
    public static void linhaEmBranco() {
        imprimir("", true);
    }

    /**
     * Imprime a mensagem enviada, faz a leitura do texto digitado no prompt de
     * comandos e retorna uma String no formato ISO-8859-1 Latin ou UTF-8.
     *
     * @return String
     */
    public static String lerLinha(String mensagem) {
        imprimir(mensagem);
        return lerLinha();
    }

    /**
     * Faz a leitura de texto digitado no prompt de comandos e retorna uma String no
     * formato ISO-8859-1 Latin ou UTF-8.
     *
     * @return String
     */
    public static String lerLinha() {
        while (true) {
            try {
                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);
                return br.readLine();
            } catch (IOException e) {
                imprimirErro("Texto inválido, digite novamente...", true);
            }
        }
    }

    /**
     * Imprime a mensagem enviada, faz a leitura do número digitado no prompt de
     * comandos e retorna um int.
     *
     * @return int
     */
    public static int lerInteiro(String mensagem, boolean newLine) {
        imprimir(mensagem, newLine);
        return lerInteiro();
    }

    /**
     * Faz a leitura do número digitado no prompt de comandos e retorna um int.
     *
     * @return int
     */
    private static int lerInteiro() {
        while (true) {
            try {
                String linha = lerLinha();
                if (linha.isEmpty()) {
                    return 0;
                }
                return Integer.parseInt(linha);
            } catch (NumberFormatException tExcept) {
                imprimirErro("Inteiro inválido, digite novamente...", true);
            }
        }
    }

    /**
     * Imprime a mensagem enviada, faz a leitura do número digitado no prompt de
     * comandos e retorna um double.
     *
     * @return double
     */
    public static double lerDecimal(String mensagem, boolean newLine) {
        imprimir(mensagem, newLine);
        return lerDecimal();
    }

    /**
     * Faz a leitura do número digitado no prompt de comandos e retorna um double.
     *
     * @return double
     */
    private static double lerDecimal() {
        while (true) {
            try {
                String linha = lerLinha();
                if (linha.isEmpty()) {
                    return 0;
                }
                return Double.parseDouble(linha);
            } catch (NumberFormatException e) {
                imprimirErro("Decimal inválido, digite novamente...", true);
            }
        }
    }

    /**
     * Faz uma pausa no processamento e pede para o usuário pressionar enter para
     * continuar.
     */
    public static void pressionarEnter() {
        imprimir("Pressione ENTER para continuar...", false);
        lerLinha();
    }
}