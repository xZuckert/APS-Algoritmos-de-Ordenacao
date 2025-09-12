package Ordination;

public class SelectionSort {
    public static int[] Sort(int[] arr) {
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
}