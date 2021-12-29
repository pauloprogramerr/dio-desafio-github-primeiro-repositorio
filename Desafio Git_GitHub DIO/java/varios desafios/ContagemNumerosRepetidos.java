package br.com.desafios.desafio;

import java.util.*;

public class ContagemNumerosRepetidos {

    public static void contNumerosRepetidos(){
        Scanner scanner = new Scanner(System.in);
        int inputs = 0, cont = 0;
        Map<Integer, Integer> numeroRepetido = new HashMap<>();

        inputs = scanner.nextInt();
        Integer[] numeros = new Integer[inputs];

        while(true){
            if(cont >= inputs) break;
                numeros[cont] = scanner.nextInt();
            cont++;
        }
        for (int i = 0; i < numeros.length; i++){
            cont = 0;
            for(int j = 0; j < numeros.length; j++)
                if (numeros[i].equals(numeros[j])){
                    cont++;
                    numeroRepetido.put(numeros[i], cont);
            }
        }
        numeroRepetido.entrySet()
                      .stream()
                      .sorted(Map.Entry.comparingByKey())
                      .forEach(e -> System.out.println(e.getKey() + " aparece " + e.getValue() + " vez(es)"));
    }
    public static void main(String[] args) {
        contNumerosRepetidos();
    }
}

