package Ordination;
import Controller.Menu;

public class BubbleSort extends Menu {
    public static int[] Sort(int[] arr) {
        boolean trocou;     // variavel para verificar se houve troca de posição dos numeros da lista
        int aux;            // variavel auxiliar
        do {
            trocou = false;
            for (int i = 0; i < (arr.length - 1); i++) {
                // verifica se o numero da posição atual é maior que o da posição seguinte
                if (arr[i] > arr[i + 1]) {
                    // usa a variavel auxiliar para fazer a troca do numero na posição atual com o da posição seguinte
                    aux = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = aux;
                    trocou = true; // define que houve um troca de posição
                }
            }
        } while (trocou) ;
        return arr;
    }
}