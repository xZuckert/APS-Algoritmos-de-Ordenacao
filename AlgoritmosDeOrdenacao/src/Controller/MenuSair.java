package Controller;

public class MenuSair extends Menu {
    public void executar() throws InterruptedException {
        System.out.println("\nEncerrado Programa...");
            Thread.sleep(800);
        System.out.println("\nPrograma finalizado com sucesso!");
    }
}
