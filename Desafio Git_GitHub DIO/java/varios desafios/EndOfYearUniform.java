package br.com.desafios.desafio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

/***
 * @author PauloProgram
 * @version 1.0.0
 * */

public class EndOfYearUniform {
    private static BufferedReader br;
    private static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int quantity = Integer.parseInt(st.nextToken());
        List<Uniform> uniforms = new ArrayList<>();

    for (int i = 0; i <= quantity; i++) {
        var next = br.readLine();
        if(next.equals("0")) {
        break;
    }

        Uniform uniform = new Uniform();
        uniform.setName(next);
        var tshirt = br.readLine().split(" ");
        uniform.setCollor(tshirt[0]);
        uniform.setSize(tshirt[1]);
        uniforms.add(uniform);
    }
        Comparator<Uniform> comparator = Comparator
            .comparing(Uniform::getCollor).reversed()
            .thenComparing(Uniform::getSize).reversed()
            .thenComparing(Uniform::getName);
            uniforms.stream().sorted(comparator).forEach(System.out::println);
    }
public static class Uniform {
    private String name;
    private String collor;
    private String size;

    @Override
    public String toString() {
        return collor + " " + size + " "+ name;}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;}
    public String getCollor() {
        return collor;}
    public void setCollor(String collor) {
                this.collor = collor;
            }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
        }
    }
}