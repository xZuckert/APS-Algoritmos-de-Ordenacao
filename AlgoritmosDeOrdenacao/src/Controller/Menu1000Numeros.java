package Controller;
import Reader.LerNumeros;

public class Menu1000Numeros extends Menu {
    private final int algoritmoEscolhido; // 1 = Bubble, 2 = Selection, 3 = Quick
    public Menu1000Numeros(int algoritmoEscolhido) {
        this.algoritmoEscolhido = algoritmoEscolhido;
    }
    @Override
    public void executar() throws InterruptedException {
        super.executar();
        Thread.sleep(200);
        String localFile = "AlgoritmosDeOrdenacao/src/Reader/NumerosAleatorios/1000NumerosAleatorios.txt";
        int[] numeros = LerNumeros.lerNumeros(localFile);
        iniciarMenu("1000 números ordenados em ", numeros, algoritmoEscolhido);
        Thread.sleep(1000);
    }
}