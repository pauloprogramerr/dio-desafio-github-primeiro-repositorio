import java.io.IOException;
import java.util.Scanner;

public class ExibindoNumerosPares{
	
    public static void main(String[] args) throws IOException {
      Scanner leitor = new Scanner(System.in);
      int num = leitor.nextInt();
    	for (int i = 2 ; i <= num; i++) {
    		if (i % 2 == 0) System.out.println(i);
    	}
    }
}