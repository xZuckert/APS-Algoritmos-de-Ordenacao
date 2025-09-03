import LeitorTXT.LerNumeros;
import Ordination.BubbleSort;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        String localFile = "C:/Users/xXPZC/OneDrive/Documentos/github/APS-Algoritmos-de-Ordenacao/AlgoritmosDeOrdenacao/src/LeitorTXT/500NumerosAleatorios.txt";
        int[] numeros = LerNumeros.lerNumeros(localFile);
        List<Integer> numerosOrdenados = BubbleSort.Sort(numeros);
        System.out.println(numerosOrdenados);
    }
}