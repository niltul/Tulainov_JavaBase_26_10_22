package com.hillel.tulainov.homeworks.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {

        Random random = new Random();

        int[] lotteryNumbers = random.ints(7, 0, 10).toArray();
        int[] playerNumber = random.ints(7, 0, 10).toArray();

        Arrays.sort(lotteryNumbers);
        Arrays.sort(playerNumber);

        System.out.println(Arrays.toString(lotteryNumbers));
        System.out.println(Arrays.toString(playerNumber));

        int count = 0;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < lotteryNumbers.length; i++) {

            if (lotteryNumbers[i] == playerNumber[i]) {
                int index = Arrays.binarySearch(lotteryNumbers, lotteryNumbers[i]);
                indexes.add(index);
                count++;
            }
        }

        if  (indexes.size() == 1) {
            System.out.println("There was only one coincide at index: " + indexes);
        } else if (count > 0) {
            System.out.println("The count of coincidences: " + count);
            System.out.println("Indexes of elements that coincide: " + indexes);
        } else {
            System.out.println("No coincidence found");
        }

    }
}
