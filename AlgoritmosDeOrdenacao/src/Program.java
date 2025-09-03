import LeitorTXT.LerNumeros;
import Ordination.BubbleSort;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String localFile; int[] numeros; List<Integer> numerosOrdenados;
        System.out.print("Escolha a quantidade de números para ordenar:\n" +
                "1 - 500 números\n" +
                "2 - 1000 números\n" +
                "3 - 5000 números\n" +
                "4 - 10000 números\n" +
                "5 - Sair\n" +
                "\nSua opção: ");
        Scanner sc = new Scanner(System.in);
        int resp = sc.nextInt();
        switch (resp) {
            case 1:
                localFile = "C:/Users/xXPZC/OneDrive/Documentos/github/APS-Algoritmos-de-Ordenacao/AlgoritmosDeOrdenacao/src/LeitorTXT/NumerosAleatorios/500NumerosAleatorios.txt";
                numeros = LerNumeros.lerNumeros(localFile);
                numerosOrdenados = BubbleSort.Sort(numeros);
                System.out.println(numerosOrdenados);
                break;
            case 2:
                localFile = "C:/Users/xXPZC/OneDrive/Documentos/github/APS-Algoritmos-de-Ordenacao/AlgoritmosDeOrdenacao/src/LeitorTXT/NumerosAleatorios/1000NumerosAleatorios.txt";
                numeros = LerNumeros.lerNumeros(localFile);
                numerosOrdenados = BubbleSort.Sort(numeros);
                System.out.println(numerosOrdenados);
                break;
            case 3:
                localFile = "C:/Users/xXPZC/OneDrive/Documentos/github/APS-Algoritmos-de-Ordenacao/AlgoritmosDeOrdenacao/src/LeitorTXT/NumerosAleatorios/5000NumerosAleatorios.txt";
                numeros = LerNumeros.lerNumeros(localFile);
                numerosOrdenados = BubbleSort.Sort(numeros);
                System.out.println(numerosOrdenados);
                break;
            case 4:
                localFile = "C:/Users/xXPZC/OneDrive/Documentos/github/APS-Algoritmos-de-Ordenacao/AlgoritmosDeOrdenacao/src/LeitorTXT/NumerosAleatorios/10000NumerosAleatorios.txt";
                numeros = LerNumeros.lerNumeros(localFile);
                numerosOrdenados = BubbleSort.Sort(numeros);
                System.out.println(numerosOrdenados);
                break;
            case 5:
                System.out.println("Encerrado Programa...");
        }
        System.out.println("Programa finalizado com sucesso!");
    }
}