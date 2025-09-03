package Controller;

import Ordination.BubbleSort;
import Reader.LerNumeros;
import java.util.List;

public class Menu500Numeros extends Menu {
    public void Executar() throws InterruptedException {
        super.Executar();
        Menu.ExibirTitulo("500 números ordenados com Bubble Sort:");
        Thread.sleep(200);
        String localFile = "AlgoritmosDeOrdenacao/src/Reader/NumerosAleatorios/500NumerosAleatorios.txt";
        int[] numeros = LerNumeros.lerNumeros(localFile);
        List<Integer> numerosOrdenados = BubbleSort.Sort(numeros);
        System.out.println(numerosOrdenados);
        Thread.sleep(1000);
    }
}
