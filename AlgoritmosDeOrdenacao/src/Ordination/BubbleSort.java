package Ordination;

public class BubbleSort {
    public static void Sort(int[] numeros) {
        boolean trocou;
        int aux;
        do {
            trocou = false;
            for (int i = 0; i < (numeros.length - 1); i++) {
                if (numeros[i] > numeros[i + 1]) {
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    trocou = true;
                }
            }
        } while (trocou) ;
        for (int numero: numeros) {
            System.out.print(numero + " ");
        }
    }
}
