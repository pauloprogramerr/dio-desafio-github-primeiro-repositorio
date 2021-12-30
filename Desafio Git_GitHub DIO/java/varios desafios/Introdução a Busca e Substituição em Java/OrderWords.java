package br.com.desafios.desafio;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.io.IOException;

public class OrderWords {
    public static void runs() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputs = Integer.parseInt(br.readLine());
        String words, orderList;

        List<String> listOfWords = new ArrayList<>();

        for (int i = 0; i < inputs; i++) {
            words = br.readLine();
            // fatiamento da string
            listOfWords.addAll(Arrays.stream(words.split(" "))
                       .collect(Collectors.toList()));
            // ordena a string
            orderList = listOfWords.stream()
                    .sorted(Comparator.comparingInt(String::length).reversed()
                    .thenComparing(String::compareTo)).collect(Collectors.joining(" "));
            System.out.println(orderList);

            //limpa lista
            listOfWords.clear();
        }
    }

    public static void main(String[] args) throws IOException{
        runs();
    }
}
