package Controller;

import java.util.Map;
import java.util.Scanner;

public class OpcoesMenu {
    private Map<Integer, Menu> opcoes;

    public OpcoesMenu(Map<Integer, Menu> opcoes) {
        this.opcoes = opcoes;
    }
    public void ExibirOpcoesMenuNumeros() throws InterruptedException {
        Thread.sleep(500);
        Menu.ExibirTitulo("Projeto: Algoritmos de Ordenacao");
        Scanner sc = new Scanner(System.in);
        Thread.sleep(500);
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
            return;
        }
        if (opcoes.containsKey(resp)) {
            Menu menuASerExibido = opcoes.get(resp);
            menuASerExibido.Executar();
            if (resp > 0) ExibirOpcoesMenuNumeros();
        } else {
            System.out.println("Opção Inválida");
        }
    }
}
