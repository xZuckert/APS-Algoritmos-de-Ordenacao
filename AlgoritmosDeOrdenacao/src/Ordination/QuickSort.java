package Ordination;

public class QuickSort {
    public static int[] sort(int[] arr) {
        return sort(arr, 0, arr.length - 1);
    }
    public static int[] sort(int[] arr, int inicio, int fim) {
        if (inicio < fim) {
            int pivoIndex = parcionar(arr, inicio, fim);
            sort(arr, inicio, pivoIndex - 1);
            sort(arr, pivoIndex + 1, fim);
        }
        return arr;
    }
    private static int parcionar(int[] arr, int inicio, int fim) {
        int pivo = arr[fim];
        int i = inicio - 1;
        for(int j = inicio; j < fim; j++) {
            if (arr[j] <= pivo) {
                i++;
                trocar(arr, i, j);
            }
        }
        trocar(arr, i + 1, fim);
        return i + 1;
    }
    private static void trocar(int[] arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
