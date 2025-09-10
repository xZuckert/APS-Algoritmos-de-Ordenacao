package Ordination;

import java.util.ArrayList;
import java.util.List;
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
    public static List<Integer> Sort(int[] arr) {
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
        List<Integer> novaOrdem = new ArrayList<>();
        for(int numero : arr){
            novaOrdem.add(numero);
        }
        return novaOrdem;
    }
}