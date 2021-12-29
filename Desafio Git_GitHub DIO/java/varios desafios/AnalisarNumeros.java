package br.com.desafios.desafio;

import java.io.IOException;
import java.util.Scanner;


public class AnalisarNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
//declare suas variaveis corretamente

        int[] valor = new int[5];
        int contNegativo = 0;
        int contPositivo = 0;
        int contPar = 0;
        int contImpar = 0;

//continue a solu��o
        for (int i = 0; i < 5; i++) {
            valor[i] = leitor.nextInt();
            // conta os numeros negativos OK
            if (valor[i] < 0 ){
                contNegativo++;

                // conta os numeros impares dentro da condi��o de negativo
                if (valor[i] % 2 == 0) {
                    contPar++;
                }else {
                    contImpar++;
                }

            }else if (valor[i] > 0 ) {
                contPositivo++;

                // conta os numeros pares dentro da condi��o de positivo
                if (valor[i] % 2 == 0) {
                    contPar++;
                }else {
                    contImpar++;
                }
            }else {
                contPar++;
            }
        }
//insira suas variaveis corretamente
        System.out.println(contPar + " par(es)");
        System.out.println(contImpar + " impar(es)");
        System.out.println(contPositivo + " positivo(s)");
        System.out.println(contNegativo + " negativo(s)");
    }
}