package Controller;

import Ordination.BubbleSort;
import Reader.LerNumeros;
import java.util.List;

public class Menu1000Numeros extends Menu {
    public void Executar() throws InterruptedException {
        super.Executar();
        Menu.ExibirTitulo("1000 números ordenados com Bubble Sort:");
        Thread.sleep(200);
        String localFile = "AlgoritmosDeOrdenacao/src/Reader/NumerosAleatorios/1000NumerosAleatorios.txt";
        int[] numeros = LerNumeros.lerNumeros(localFile);
        List<Integer> numerosOrdenados = BubbleSort.Sort(numeros);
        System.out.println(numerosOrdenados);
        Thread.sleep(500);
    }
}
