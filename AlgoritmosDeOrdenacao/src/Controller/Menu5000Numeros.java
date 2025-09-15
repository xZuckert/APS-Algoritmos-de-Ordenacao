package Controller;
import Ordination.BubbleSort;
import Ordination.SelectionSort;
import Ordination.QuickSort;
import Reader.LerNumeros;
import java.util.Arrays;

public class Menu5000Numeros extends Menu {
    private final int algoritmoEscolhido; // 1 = Bubble, 2 = Selection, 3 = Quick
    public Menu5000Numeros(int algoritmoEscolhido) {
        this.algoritmoEscolhido = algoritmoEscolhido;
    }
    @Override
    public void Executar() throws InterruptedException {
        super.Executar();
        Thread.sleep(200);
        String localFile = "AlgoritmosDeOrdenacao/src/Reader/NumerosAleatorios/5000NumerosAleatorios.txt";
        long startTime; long endTime; // variaveis para calcular o tempo de execucao do algoritmo de ordenacao
        int[] numeros = LerNumeros.lerNumeros(localFile); int[] numerosOrdenados;
        // escolhe o algoritmo
        switch (algoritmoEscolhido) {
            case 1:
                Menu.ExibirTitulo("5000 números ordenados em Bubble Sort:");
                startTime = System.currentTimeMillis();
                numerosOrdenados = BubbleSort.Sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            case 2:
                Menu.ExibirTitulo("5000 números ordenados em Selection Sort:");
                startTime = System.currentTimeMillis();
                numerosOrdenados = SelectionSort.Sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            case 3:
                Menu.ExibirTitulo("5000 números ordenados em Quick Sort:");
                startTime = System.currentTimeMillis();
                numerosOrdenados = QuickSort.Sort(numeros);
                endTime = System.currentTimeMillis();
                break;
            default:
                System.out.println("Algoritmo inválido.");
                return;
        }
        System.out.println(Arrays.toString(numerosOrdenados));
        System.out.println("Tempo para ordenar 5000 elementos: " + (endTime - startTime) + "ms");
        Thread.sleep(1000);
    }
}