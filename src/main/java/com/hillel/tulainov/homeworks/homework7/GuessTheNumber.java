package com.hillel.tulainov.homeworks.homework7;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int guessNumber = 0;
        for (int i = 0; i <= 10; i++) {
            guessNumber = (int) (Math.random() * 10);
        }

        System.out.println("Guess the number from 1 to 10 (you have 3 attempts) :");

        for (int i = 0;; i++) {

            int inputNumber = Integer.parseInt(scanner.nextLine());

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
