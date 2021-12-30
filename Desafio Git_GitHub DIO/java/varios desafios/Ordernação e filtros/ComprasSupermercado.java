import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ComprasSupermercado {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Set<String> ordenado = new TreeSet<>();

    public static void runs() throws IOException {
        var entrada = Integer.parseInt(reader.readLine());
        var contador = 1;
        String ordernar;

        while (contador <= entrada) {
            ordernar = reader.readLine();
            String[] a = ordernar.split("\\s+");
            
            // limpa a lista
                ordenado.clear();

            //preenche a lista ordenando a mesma
            for (int i = 0; i < a.length; i++) {
                    ordenado.add(a[i]);
                }

                // saída no console
                for (String ordem : ordenado) {
                    System.out.print(ordem + " ");
                }
                contador++;
                System.out.println();
        }
    }

    public static void main(String[] args) throws IOException{
        runs();
    }
}
