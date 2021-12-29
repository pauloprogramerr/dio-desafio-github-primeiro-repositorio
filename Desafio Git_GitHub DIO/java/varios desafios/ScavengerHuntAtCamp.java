package br.com.desafios.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScavengerHuntAtCamp {
    static String student;
    static String cardValue;
    static int numberStudents;
    static int currentCard;
    static int indexCurrent = 0;
    static int indexDeleted = 0;
    static Scanner scr;

    public static void main(String[] args) {
        scr = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();

        numberStudents = Integer.parseInt(scr.next());
        while (numberStudents > 0) {
            for (int i = 0; i < numberStudents; i++) {
                student = scr.next();
                cardValue = scr.next();
                studentList.add(student.trim() + " " + cardValue.trim());
            }
            currentCard = Integer.parseInt(studentList.get(indexCurrent).split(" ")[1]);
            for (int i = 0; i < numberStudents - 1; i++) {
                if (currentCard % 2 == 0)
                    indexDeleted = (studentList.size() - (currentCard % studentList.size()) +
                            indexCurrent) % studentList.size();
                else
                    indexDeleted = (currentCard % studentList.size() + indexCurrent) % studentList.size();

                currentCard = Integer.parseInt(studentList.get(indexDeleted).split(" ")[1]);
                studentList.remove(indexDeleted);

                indexCurrent = (currentCard % 2 == 0) ? ((indexDeleted <= studentList.size() - 1) ?
                        indexDeleted : 0):((indexDeleted == 0) ? (studentList.size() - 1):(indexDeleted - 1));
            }
            System.out.println("Vencedor(a): " + studentList.get(0).split(" ")[0]);
            studentList.clear();
            numberStudents = Integer.parseInt(scr.next());
        }
    }
}