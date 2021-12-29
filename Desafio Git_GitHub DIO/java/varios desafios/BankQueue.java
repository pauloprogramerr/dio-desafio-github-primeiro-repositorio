package br.com.desafios.desafio;

import java.util.*;

public class BankQueue {

    public static void main(String[] args) {
        int peopleOnQueue;
        int currentNumber;
        int numSwitches;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<Integer> currentQueue = new ArrayList<>();
        HashMap<Integer, Integer> numberIndexOrigin = new HashMap<>();

        for(int i = 0; i < n; i++) {
            peopleOnQueue = scanner.nextInt();
            numSwitches = 0;

            for(int j = 0; j < peopleOnQueue; j++) {
                currentNumber = scanner.nextInt();
                currentQueue.add(currentNumber);
                numberIndexOrigin.put(currentNumber, currentQueue.size() - 1);
            }

            NumberComparator comparator = new NumberComparator();
            Collections.sort(currentQueue, comparator);

            for(int k = 0; k < currentQueue.size(); k++) {
                int originIndex = numberIndexOrigin.get(currentQueue.get(k));

                if(originIndex != k) {
                    numSwitches++;
                }
            }
            System.out.println(peopleOnQueue - numSwitches);
            currentQueue = new ArrayList<>();
        }
        scanner.close();
    }

    static class NumberComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num0, Integer num1) {
            int res = num0.compareTo(num1);
            return -res;
        }
    }
}