package Controller;

import Ordination.BubbleSort;
import Ordination.SelectionSort;
import Ordination.QuickSort;
import Reader.LerNumeros;
import java.util.List;

public class Menu1000Numeros extends Menu {
    private int algoritmoEscolhido; // 1 = Bubble, 2 = Selection, 3 = Quick
    public Menu1000Numeros(int algoritmoEscolhido) {
        this.algoritmoEscolhido = algoritmoEscolhido;
    }
    @Override
    public void Executar() throws InterruptedException {
        super.Executar();
        Thread.sleep(200);
        String localFile = "AlgoritmosDeOrdenacao/src/Reader/NumerosAleatorios/1000NumerosAleatorios.txt";
        int[] numeros = LerNumeros.lerNumeros(localFile);
        List<Integer> numerosOrdenados = null;
        // escolhe o algoritmo
        switch (algoritmoEscolhido) {
            case 1:
                Menu.ExibirTitulo("1000 números ordenados em Bubble Sort:");
                numerosOrdenados = BubbleSort.Sort(numeros);
                break;
            case 2:
                Menu.ExibirTitulo("1000 números ordenados em Selection Sort:");
                // numerosOrdenados = SelectionSort.Sort(numeros);
                System.out.println("SelectionSort ainda não implementado.");
                return;
            case 3:
                Menu.ExibirTitulo("1000 números ordenados em Quick Sort:");
                // numerosOrdenados = QuickSort.Sort(numeros);
                System.out.println("QuickSort ainda não implementado.");
                return;
            default:
                System.out.println("Algoritmo inválido.");
                return;
        }
        System.out.println(numerosOrdenados);
        Thread.sleep(1000);
    }
}