package br.com.desafios.desafio;

import java.util.Scanner;

public class WebBlogBrazil {
    static Scanner scanner;

    private static void runs() {
        String text;
        boolean teste;
        scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            text = scanner.nextLine();
            teste = true;

            //pecorre o texto
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) == '_' && teste) || (text.charAt(i) == '*' && teste)) {
                    text = text.replaceFirst("_(?i)", "<i>");
                    text = text.replaceFirst("\\*(?i)", "<b>");
                    teste = false;
                } else if ((text.charAt(i) == '_' && !teste) || (text.charAt(i) == '*' && !teste)) {
                    text = text.replaceFirst("_(?i)", "</i>");
                    text = text.replaceFirst("\\*", "</b>");
                    teste = true;
                }
            }
            System.out.println(text);
        }
        scanner.close();
    }
    public static void main(String[] args) {
       runs();
    }
}
