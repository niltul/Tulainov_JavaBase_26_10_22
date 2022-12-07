package com.hillel.tulainov.homeworks.homework8;

public class SpaceShuttles {
    public static void main(String[] args) {

        System.out.println("- Is there life on Mars?");
        System.out.println("- Let's fly there and check!");
        System.out.println("- But we need space shuttles.");
        System.out.println("- Let's create them and give them number! and then fly!");
        for (int i = 1; i <= 100; i++) {
            String number = Integer.toString(i);
            if (number.contains("4") || number.contains("9")) {
                continue;
            }
            System.out.println(number);
        }

        System.out.println("Time to go!");
    }
}
