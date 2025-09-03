package LeitorTXT;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LerNumeros {
    public static int[] lerNumeros(String localFile) {
        int[] numeros = {};
        try {
            // le o arquivo txt como uma string unica e divide em uma lista, separando os elementos pelo espaco
            String conteudo = Files.readString(Paths.get(localFile));
            String[] partes = conteudo.split(" ");
            // transforma cada elemento da lista em inteiro
            numeros = new int[partes.length];
            for (int i = 0; i < partes.length; i++) {
                numeros[i] = Integer.parseInt(partes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numeros;
    }
}

