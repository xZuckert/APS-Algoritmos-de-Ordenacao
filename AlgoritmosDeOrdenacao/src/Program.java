import Controller.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Menu.exibirLogo();
        Map<Integer, Menu> opcoes = new HashMap<>();
        opcoes.put(1, new Menu1000Numeros(1));
        opcoes.put(2, new Menu5000Numeros(1));
        opcoes.put(3, new Menu10000Numeros(1));
        opcoes.put(0, new MenuSair());
        OpcoesMenu opcoesMenu = new OpcoesMenu(opcoes);
        opcoesMenu.exibirOpcoesMenuNumeros();
    }
}