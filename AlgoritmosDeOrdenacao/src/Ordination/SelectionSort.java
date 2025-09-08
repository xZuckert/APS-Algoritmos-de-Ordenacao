package Ordination;

import java.util.Arrays;

/**
 * Implementação do algoritmo Selection Sort em Java.
 *
 * O Selection Sort funciona encontrando repetidamente o menor elemento
 * da parte não ordenada do array e colocando-o no início.
 *
 * Complexidade de tempo: O(n²)
 * Complexidade de espaço: O(1)
 */
public class SelectionSort {

    /**
     * Ordena um array usando o algoritmo Selection Sort.
     *
     * @param arr Array de inteiros a ser ordenado
     * @return Array ordenado
     */
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // Percorre todo o array
        for (int i = 0; i < n; i++) {
            // Encontra o índice do menor elemento na parte não ordenada
            int minIdx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            // Troca o elemento atual com o menor elemento encontrado
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }

        return arr;
    }

    /**
     * Versão do Selection Sort que mostra o passo a passo da ordenação.
     *
     * @param arr Array de inteiros a ser ordenado
     * @return Array ordenado
     */
    public static int[] selectionSortVerbose(int[] arr) {
        System.out.println("Array inicial: " + Arrays.toString(arr));
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int minIdx = i;
            System.out.println("\nPasso " + (i + 1) + ":");
            System.out.println("  Procurando o menor elemento a partir da posição " + i);

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                    System.out.println("  Novo menor elemento encontrado: " + arr[minIdx] + " na posição " + minIdx);
                }
            }

            if (minIdx != i) {
                System.out.println("  Trocando " + arr[i] + " (posição " + i + ") com " + arr[minIdx] + " (posição " + minIdx + ")");
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            } else {
                System.out.println("  " + arr[i] + " já está na posição correta");
            }

            System.out.println("  Array após o passo: " + Arrays.toString(arr));
        }

        System.out.println("\nArray final ordenado: " + Arrays.toString(arr));
        return arr;
    }

    /**
     * Método utilitário para copiar um array.
     *
     * @param original Array original
     * @return Cópia do array
     */
    public static int[] copyArray(int[] original) {
        return Arrays.copyOf(original, original.length);
    }

    /**
     * Método principal para testar o algoritmo.
     *
     * @param args Argumentos da linha de comando
     */
    public static void main(String[] args) {
        // Teste básico
        int[] numeros = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("=== TESTE BÁSICO ===");
        int[] resultado = selectionSort(copyArray(numeros));
        System.out.println("Original: " + Arrays.toString(numeros));
        System.out.println("Ordenado: " + Arrays.toString(resultado));

        // Teste com visualização passo a passo
        System.out.println("\n=== TESTE COM VISUALIZAÇÃO ===");
        int[] numerosVerbose = {64, 34, 25, 12, 22, 11, 90};
        selectionSortVerbose(numerosVerbose);

        // Teste com outros tipos de dados
        System.out.println("\n=== OUTROS TESTES ===");

        // Array já ordenado
        int[] ordenado = {1, 2, 3, 4, 5};
        System.out.println("Array já ordenado: " + Arrays.toString(selectionSort(copyArray(ordenado))));

        // Array em ordem decrescente
        int[] decrescente = {5, 4, 3, 2, 1};
        System.out.println("Array decrescente: " + Arrays.toString(selectionSort(copyArray(decrescente))));

        // Array com elementos repetidos
        int[] repetidos = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        System.out.println("Array com repetidos: " + Arrays.toString(selectionSort(copyArray(repetidos))));

        // Array vazio
        int[] vazio = {};
        System.out.println("Array vazio: " + Arrays.toString(selectionSort(copyArray(vazio))));

        // Array com um elemento
        int[] umElemento = {42};
        System.out.println("Um elemento: " + Arrays.toString(selectionSort(copyArray(umElemento))));

        // Teste de performance com array maior
        System.out.println("\n=== TESTE DE PERFORMANCE ===");
        int[] arrayGrande = new int[1000];
        for (int i = 0; i < arrayGrande.length; i++) {
            arrayGrande[i] = (int) (Math.random() * 1000);
        }

        long startTime = System.currentTimeMillis();
        selectionSort(copyArray(arrayGrande));
        long endTime = System.currentTimeMillis();

        System.out.println("Tempo para ordenar 1000 elementos: " + (endTime - startTime) + "ms");
    }
}
