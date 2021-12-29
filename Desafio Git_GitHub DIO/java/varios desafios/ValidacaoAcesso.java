package br.com.desafios.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

public class ValidacaoAcesso {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void validar(String senha) {

        Pattern patterNumber, patterUpper, patterLower, patterCharacter, patterSpace;

        patterNumber = Pattern.compile("\\d");
        patterUpper = Pattern.compile("\\p{Upper}");
        patterLower = Pattern.compile("\\p{Lower}");
        patterCharacter = Pattern.compile("\\p{Punct}");
        patterSpace = Pattern.compile("\\p{Space}");

        if (patterNumber.matcher(senha).find() &&
                (patterUpper.matcher(senha).find()) &&
                (patterLower.matcher(senha).find()) &&
                (!patterSpace.matcher(senha).find()) &&
                (!patterCharacter.matcher(senha).find()) &&
                (senha.length() >= 6)) {
            System.out.println("Senha valida.");
        } else {
            System.out.println("Senha invalida.");
        }
    }

    public static void recebeDados() throws IOException {
        Set<String> lista = new LinkedHashSet<>();
        String s, ss;

        ss = reader.readLine();
        lista.add(ss);
        while (reader.ready()){
            s = reader.readLine();
            lista.add(s);

        }

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){
            String a = iterator.next();
            if (a.equals("")) continue;
            validar(a);
        }

    }
    public static void main(String[] args) throws IOException{
        recebeDados();
    }
}