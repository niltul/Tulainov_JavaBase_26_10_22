package com.hillel.tulainov.homeworks.homework11;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int firstNum;
        int secondNum;

        System.out.println("Please enter two numbers: ");

        while (true) {

            if (scanner.hasNextInt()) {

                firstNum = Integer.parseInt(scanner.nextLine());

                if (scanner.hasNextInt()) {
                    secondNum = Integer.parseInt(scanner.nextLine());
                    break;
                } else {
                    System.out.println("Wrong input. Try again.");
                    scanner.nextLine();
                }

            } else {
                System.out.println("wrong input, try again");
                scanner.nextLine();
            }

        }



        int[][] firstArr = new int[firstNum][secondNum];

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                firstArr[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("FIRST");
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                System.out.print(firstArr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        int[][] secondArr = new int[secondNum][firstNum];

        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < secondArr.length; j++) {

                secondArr[j][i] = firstArr[i][j];

            }
        }

        System.out.println("SECOND");
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < secondArr[i].length; j++) {
                System.out.print(secondArr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
