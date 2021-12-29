package br.com.desafios.desafio;

import java.util.Scanner;

public class CoracaoDasCartas {
    public static void novoTeste() {
        Scanner leitor = new Scanner(System.in);
        int cont = 0, input, N, resultado;
        do {
            resultado = 0;
            // entrada da quantidade de jogadas
            N = leitor.nextInt();
            for (int i = 0; i < N; i++) {
                // recebe as 3 cartas escolhidas
                for (int j = 0; j < 3; j++) {
                    input = leitor.nextInt();
                    // soma o valor das cartas
                    resultado += input;
                }
            }
            // não imprimir caso a entrada seja 0
            if(N == 0) break;
            if (resultado % 3 == 0)
                System.out.println("1");
            else
                System.out.println("0");
        }while(N > 0);
    }
    public static void main(String[] args) {
        //novoTeste();
        teste();
    }
    public static void teste(){
        Scanner leitor = new Scanner(System.in);
        int a, b, c, N, resultado;
        boolean vdd = true;
        do {
            resultado = 0;

            N = leitor.nextInt();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < 3; j++) {
                    a = leitor.nextInt();
                    b = leitor.nextInt();
                    c = leitor.nextInt();
                        resultado += a + b + c;
                    if ((a >= 0 && b >= 0 && c >= 0) && (resultado % 3 == 0)) {
                        resultado = 0;
                        vdd = true;
                    } else {
                        resultado = 1;
                        vdd = false;
                    }
                }
            }
            if(N == 0) break;
                if (resultado == 0 && vdd) {
                    System.out.println("1");
                }else
                    System.out.println("0");
        }while(N > 0);
    }
}