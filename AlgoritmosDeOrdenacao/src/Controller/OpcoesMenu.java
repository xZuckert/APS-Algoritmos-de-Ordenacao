package Controller;

import java.util.Map;
import java.util.Scanner;

public class OpcoesMenu {
    private Map<Integer, Menu> opcoes;
    public OpcoesMenu(Map<Integer, Menu> opcoes) {
        this.opcoes = opcoes;
    }
    // Menu principal: escolha da quantidade
    public void ExibirOpcoesMenuNumeros() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Thread.sleep(500);
            Menu.ExibirTitulo("Projeto: Algoritmos de Ordenacao");
            System.out.print("Escolha a quantidade de números para ordenar:\n" +
                    "1 - 500 números\n" +
                    "2 - 1000 números\n" +
                    "3 - 5000 números\n" +
                    "4 - 10000 números\n" +
                    "0 - Sair\n" +
                    "\nSua opção: ");
            String opcaoEscolhida = sc.nextLine();
            Thread.sleep(200);
            int resp;
            try {
                resp = Integer.parseInt(opcaoEscolhida);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida.");
                continue;
            }
            if (resp == 0) {
                new MenuSair().Executar();
                break;
            }
            if (opcoes.containsKey(resp)) {
                // Menu de escolha do algoritmo
                int algoritmoEscolhido = ExibirOpcoesMenuSort(sc);
                if (algoritmoEscolhido == 0) continue; // voltar para menu quantidade
                // Cria o menu com a escolha do algoritmo
                Menu menuASerExibido = null;
                switch (resp) {
                    case 1:
                        menuASerExibido = new Menu500Numeros(algoritmoEscolhido);
                        break;
                    case 2:
                        menuASerExibido = new Menu1000Numeros(algoritmoEscolhido);
                        break;
                    case 3:
                        menuASerExibido = new Menu5000Numeros(algoritmoEscolhido);
                        break;
                    case 4:
                        menuASerExibido = new Menu10000Numeros(algoritmoEscolhido);
                        break;
                }
                if (menuASerExibido != null) {
                    menuASerExibido.Executar();
                }
            } else {
                System.out.println("Opção Inválida.");
            }
        }
    }
    // Menu secundário: escolha do algoritmo
    private int ExibirOpcoesMenuSort(Scanner sc) throws InterruptedException {
        Thread.sleep(200);
        System.out.print("\nEscolha o algoritmo de ordenação:\n" +
                "1 - BubbleSort\n" +
                "2 - SelectionSort\n" +
                "3 - QuickSort\n" +
                "0 - Voltar\n" +
                "\nSua opção: ");
        String opcaoEscolhida = sc.nextLine();
        Thread.sleep(200);
        int resp;
        try {
            resp = Integer.parseInt(opcaoEscolhida);
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida.");
            return -1;
        }
        if (resp >= 0 && resp <= 3) {
            return resp;
        } else {
            System.out.println("Opção inválida.");
            return -1;
        }
    }
}