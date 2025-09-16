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
                startTime = System.currentTimeMillis();
                numerosOrdenados = BubbleSort.sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            case 2:
                Menu.exibirTitulo(titulo +  "Selection Sort:");
                startTime = System.currentTimeMillis();
                numerosOrdenados = SelectionSort.sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            case 3:
                Menu.exibirTitulo(titulo +   "Quick Sort:");
                startTime = System.currentTimeMillis();
                numerosOrdenados = QuickSort.sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            default:
                System.out.println("Algoritmo inválido.");
                return;
        }
        System.out.println(Arrays.toString(numerosOrdenados));
        System.out.println("Tempo para ordenar elementos: " + (endTime - startTime) + "ms");
    }
}
