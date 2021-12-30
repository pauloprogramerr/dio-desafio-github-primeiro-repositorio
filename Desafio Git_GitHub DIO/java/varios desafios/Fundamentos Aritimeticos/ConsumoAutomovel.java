import java.io.IOException;
import java.util.Scanner;

public class ConsumoAutomovel {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        //declare as variaveis corretamente

        int distancia = leitor.nextInt();
        double totalCombustivel = leitor.nextDouble();

        double media = distancia / totalCombustivel ;  //insira as variaveis de acordo com o enunciado
        System.out.println(String.format("%.3f km/l", media));   
    }
	
}