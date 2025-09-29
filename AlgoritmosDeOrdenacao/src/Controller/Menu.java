package Controller;

import Ordination.BubbleSort;
import Ordination.QuickSort;
import Ordination.SelectionSort;

import java.util.Arrays;

public class Menu {
    public static void exibirLogo() {
        System.out.println("""
                
                ▄▀█ █░░ █▀▀ █▀█ █▀█ █ ▀█▀ █▀▄▀█ █▀█ █▀   █▀▄ █▀▀   █▀█ █▀█ █▀▄ █▀▀ █▄░█ ▄▀█ █▀▀ ▄▀█ █▀█
                █▀█ █▄▄ █▄█ █▄█ █▀▄ █ ░█░ █░▀░█ █▄█ ▄█   █▄▀ ██▄   █▄█ █▀▄ █▄▀ ██▄ █░▀█ █▀█ █▄▄ █▀█ █▄█""");
    }
    public static void exibirTitulo(String titulo) {
        int quantLetras = titulo.length();
        String ast = "*".repeat(quantLetras);
        System.out.println("\n" + ast);
        System.out.println(titulo);
        System.out.println(ast + "\n");
    }
    public void executar() throws InterruptedException {}

    protected void iniciarMenu(String titulo,int[] numeros, int algoritmoEscolhido) {
        long startTime; long endTime; // variaveis para calcular o tempo de execucao do algoritmo de ordenacao
        int[] numerosOrdenados;
        // escolhe o algoritmo
        switch (algoritmoEscolhido) {
            case 1:
                Menu.exibirTitulo(titulo + "Bubble Sort:");
                startTime = System.nanoTime();
                numerosOrdenados = BubbleSort.sort(numeros);
                endTime = System.nanoTime();
                break;
            case 2:
                Menu.exibirTitulo(titulo +  "Selection Sort:");
                startTime = System.nanoTime();
                numerosOrdenados = SelectionSort.sort(numeros);
                endTime = System.nanoTime();
                break;
            case 3:
                Menu.exibirTitulo(titulo +   "Quick Sort:");
                startTime = System.nanoTime();
                numerosOrdenados = QuickSort.sort(numeros);
                endTime = System.nanoTime();
                break;
            default:
                System.out.println("Algoritmo inválido.");
                return;
        }
        System.out.println(Arrays.toString(numerosOrdenados));
        long tempoNs = endTime - startTime;
        double tempoMs = tempoNs / 1_000_000.0;

        System.out.printf("Tempo para ordenar elementos: %.2f ms%n", tempoMs);
    }
}
