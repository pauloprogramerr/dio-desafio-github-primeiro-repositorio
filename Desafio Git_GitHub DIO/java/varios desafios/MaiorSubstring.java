package br.com.desafios.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaiorSubstring {

    public static void testando() throws IOException {
          BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          PrintWriter out = new PrintWriter(System.out);
          String max, min; //declare suas variaveis aqui

         while ((max = in.readLine()) != null) { // complete seu código
             min = in.readLine();
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

    public static void main(String[] args) throws IOException{
        testando();
    }
}
