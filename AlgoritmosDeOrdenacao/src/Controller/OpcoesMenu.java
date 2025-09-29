package Controller;
import java.util.Map;
import java.util.Scanner;

public class OpcoesMenu {
    private final Map<Integer, Menu> opcoes;
    public OpcoesMenu(Map<Integer, Menu> opcoes) {
        this.opcoes = opcoes;
    }
    // Menu principal: escolha da quantidade
    public void exibirOpcoesMenuNumeros() throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        while (true) {
            Menu.exibirTitulo("Projeto: Algoritmos de Ordenacao");
            System.out.print("""
                    Escolha a quantidade de números para ordenar:
                    1 - 1000 números
                    2 - 5000 números
                    3 - 10000 números
                    0 - Sair
                    
                    Sua opção:\s""");
            String opcaoEscolhida = sc.nextLine();
            int resp;
            try {
                resp = Integer.parseInt(opcaoEscolhida);
            } catch (NumberFormatException e) {
                System.out.println("Opção inválida.");
                continue;
            }
            if (resp == 0) {
                new MenuSair().executar();
                break;
            }
            if (opcoes.containsKey(resp)) {
                // Menu de escolha do algoritmo
                int algoritmoEscolhido = exibirOpcoesMenuSort(sc);
                if (algoritmoEscolhido == 0) continue; // voltar para menu quantidade
                // Cria o menu com a escolha do algoritmo
                Menu menuASerExibido = switch (resp) {
                    case 1 -> new Menu1000Numeros(algoritmoEscolhido);
                    case 2 -> new Menu5000Numeros(algoritmoEscolhido);
                    case 3 -> new Menu10000Numeros(algoritmoEscolhido);
                    default -> null;
                };
                if (menuASerExibido != null) {
                    menuASerExibido.executar();
                }
            } else {
                System.out.println("Opção Inválida.");
            }
        }
    }

    // Menu secundário: escolha do algoritmo
    private int exibirOpcoesMenuSort(Scanner sc) throws InterruptedException {
        Thread.sleep(200);
        System.out.print("""
                
                Escolha o algoritmo de ordenação:
                1 - BubbleSort
                2 - SelectionSort
                3 - QuickSort
                0 - Voltar
                
                Sua opção:\s""");
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