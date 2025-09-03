package Controller;

public class MenuSair extends Menu {
    public void Executar() throws InterruptedException {
        System.out.println("Encerrado Programa...");
            Thread.sleep(200);
        System.out.println("Programa finalizado com sucesso!");
    }
}
