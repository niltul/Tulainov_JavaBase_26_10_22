package com.hillel.tulainov.homeworks.homework9;

import java.util.Arrays;
import java.util.Random;

public class Rugby {
    public static void main(String[] args) {

        Random random = new Random();

        int[] firstTeam = random.ints(25, 18, 41).toArray();
        int[] secondTeam = random.ints(25, 18, 41).toArray();

        System.out.println(Arrays.toString(firstTeam));
        System.out.println(Arrays.toString(secondTeam));

        int sumAgeFirstTeam = 0;
        int sumAgeSecondTeam = 0;

        for (int element : firstTeam) {
            sumAgeFirstTeam += element;
        }

        for (int element : secondTeam) {
            sumAgeSecondTeam += element;
        }

        double averageAgeFirstTeam = (double) sumAgeFirstTeam / 25;
        double averageAgeSecondTeam = (double) sumAgeSecondTeam / 25;

        System.out.println("The average age of first team is " + averageAgeFirstTeam);
        System.out.println("The average age of second team is " + averageAgeSecondTeam);
    }
}
