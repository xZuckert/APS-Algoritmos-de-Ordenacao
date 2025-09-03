import Controller.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        Menu.Logo();
        Map<Integer, Menu> opcoes = new HashMap<>();
        opcoes.put(1, new Menu500Numeros());
        opcoes.put(2, new Menu1000Numeros());
        opcoes.put(3, new Menu5000Numeros());
        opcoes.put(4, new Menu10000Numeros());
        opcoes.put(0, new MenuSair());
        OpcoesMenu opcoesMenu = new OpcoesMenu(opcoes);
        opcoesMenu.ExibirOpcoesMenuNumeros();
    }
}