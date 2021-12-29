package br.com.desafios.desafio;
/* Desafio
 * Crie um algoritmo que receba dois inputs que sejam strings e combine-as alternando as letras de cada string.
 * Deve começar pela primeira letra da primeira string, seguido pela primeira letra da segunda string, em seguida pela segunda letra da primeira string e
 * continuar dessa forma sucessivamente. As letras restantes da cadeia mais longa devem ser adicionadas ao fim da string resultante e retornada.
 * Entrada
 * A entrada contém vários casos de teste. A primeira linha contém um inteiro N que indica a quantidade de casos de teste que vem a seguir.
 * Cada caso de teste é composto por uma linha que contém duas cadeias de caracteres, cada cadeia de caracteres contém entre 1 e 50 caracteres inclusive.
 * Saída
 * Combine as duas cadeias de caracteres da entrada como mostrado no exemplo abaixo e exiba a cadeia resultante.
 * Exemplo de Entrada
 * 2
 * aA Bb
 * aa bb
 * Exemplo de Saída
 * aBAb
 * abab
 *
 */

import java.util.Scanner;

public class AlternarLetraString {

    public static void runs(){
        Scanner scanner = new Scanner(System.in);
        int a, s = -2;
        String input;
        System.out.println("DIGITE UM VALOR");
        a = scanner.nextInt();
        while(s < a){
            input = scanner.next();


            System.out.println(input);
            s++;
        }
    }
    public static void main(String[] args) {
        runs();
    }
}
