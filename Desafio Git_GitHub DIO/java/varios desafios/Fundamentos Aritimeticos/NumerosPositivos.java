import java.util.Scanner;
import java.io.IOException;


public class NumerosPositivos{
  public static void main(String[] args) throws IOException {
	         Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente

        double[] valor = new double[6]; 
        int contPositivo = 0;
        
//continue a solução
    for (int i = 0; i < 6; i++) {
        	valor[i] = Double.parseDouble(leitor.nextLine());
        	if(valor[i] >= 0) {
        		contPositivo++;
       	}
    }
    System.out.println(contPositivo + " valores positivos");
  }
}