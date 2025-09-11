package Ordination;
import Controller.Menu;
import java.util.ArrayList;
import java.util.List;

public class BubbleSort extends Menu {
    public static int[] Sort(int[] numeros) {
        boolean trocou;     // variavel para verificar se houve troca de posição dos numeros da lista
        int aux;            // variavel auxiliar
        do {
            trocou = false;
            for (int i = 0; i < (numeros.length - 1); i++) {
                // verifica se o numero da posição atual é maior que o da posição seguinte
                if (numeros[i] > numeros[i + 1]) {
                    // usa a variavel auxiliar para fazer a troca do numero na posição atual com o da posição seguinte
                    aux = numeros[i];
                    numeros[i] = numeros[i + 1];
                    numeros[i + 1] = aux;
                    trocou = true; // define que houve um troca de posição
                }
            }
        } while (trocou) ;
        return numeros;
    }
}