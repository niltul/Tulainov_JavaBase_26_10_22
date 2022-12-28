package com.hillel.tulainov.homeworks.homework13;


import java.util.Scanner;

public class BurgerMain {
    public static void main(String[] args) {

        Burger simpleBurger = new Burger("bun", "beef", "mayo", "greens");
        Burger dietBurger = new Burger("bun", "beef", "greens");
        Burger doubleBurger = new Burger("bun", "beef", "greens", "beef", "mayo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose your burger: ");
        System.out.println("1 - simple");
        System.out.println("2 - diet");
        System.out.println("3 - double");
        int answer;

        while (true) {
            if (scanner.hasNextInt()) {

                answer = scanner.nextInt();
                if (answer <= 0 || answer >= 4) {
                    System.out.println("Wrong number, try again");
                } else {
                    break;
                }
            } else {
                System.out.println("Wrong input. try again.");
                scanner.nextLine();
            }
        }

        switch (answer) {
            case 1: simpleBurger.print(); break;
            case 2: dietBurger.print(); break;
            case 3: doubleBurger.print(); break;
        }
    }
}
