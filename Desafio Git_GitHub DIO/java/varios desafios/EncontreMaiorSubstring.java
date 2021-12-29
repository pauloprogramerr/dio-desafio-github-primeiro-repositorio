package br.com.desafios.desafio;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class EncontreMaiorSubstring {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void testando() throws IOException {
        String input,max ,min ,c ; //declare suas variaveis aqui
        while (( max = in.readLine()) != null) { // complete seu código
                min = in.readLine();
            if ( max.equals(min)) {
                System.out.println("");
            } else {
                System.out.println("");
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;

            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff; i++) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }
    public static void teste(){

    }

    public static void main(String[] args) {

    }
}