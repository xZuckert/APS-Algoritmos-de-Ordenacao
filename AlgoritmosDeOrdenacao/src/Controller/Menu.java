package Controller;

public class Menu {
    public static void Logo() {
        System.out.println("\n" +
                "▄▀█ █░░ █▀▀ █▀█ █▀█ █ ▀█▀ █▀▄▀█ █▀█ █▀   █▀▄ █▀▀   █▀█ █▀█ █▀▄ █▀▀ █▄░█ ▄▀█ █▀▀ ▄▀█ █▀█\n" +
                "█▀█ █▄▄ █▄█ █▄█ █▀▄ █ ░█░ █░▀░█ █▄█ ▄█   █▄▀ ██▄   █▄█ █▀▄ █▄▀ ██▄ █░▀█ █▀█ █▄▄ █▀█ █▄█");
    }
    public static void ExibirTitulo(String titulo) {
        int quantLetras = titulo.length();
        String ast = "*".repeat(quantLetras);
        System.out.println("\n" + ast);
        System.out.println(titulo);
        System.out.println(ast + "\n");
    }
    public void Executar() throws InterruptedException {}
}
