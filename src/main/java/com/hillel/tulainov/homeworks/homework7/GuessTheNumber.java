package com.hillel.tulainov.homeworks.homework7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guessNumber = (int) (Math.random() * 11);
        int inputNumber;

        System.out.println("Guess the number from 0 to 10 (you have 3 attempts) :");


        for (int i = 0;; i++) {

            while (true) {
                if (scanner.hasNextInt()) {
                    inputNumber = Integer.parseInt(scanner.nextLine());
                    break;
                } else {
                    System.out.println("Wrong input. Please enter the number.");
                }
                scanner.nextLine();
            }

            if (inputNumber == guessNumber) {
                System.out.println("Correct! Congratulations!");
                break;
            } else if (i == 2) {
                System.out.println("Game over! Next time you'll be luckier!");
                break;
            } else if (inputNumber < guessNumber) {
                System.out.println("Try higher value");
            } else {
                System.out.println("Try lower value");
            }

        }

    }
}
