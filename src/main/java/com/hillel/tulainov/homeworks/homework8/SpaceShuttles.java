package com.hillel.tulainov.homeworks.homework8;

public class SpaceShuttles {
    public static void main(String[] args) {

        System.out.println("- Is there life on Mars?");
        System.out.println("- Let's fly there and check!");
        System.out.println("- But we need space shuttles.");
        System.out.println("- Let's build them and give them number! and then fly!");

        int count = 0;

        for (int i = 1;; i++) {
            String number = Integer.toString(i);
            if (number.contains("4") || number.contains("9")) {
                continue;
            }

            count++;

            System.out.println(number);

            if (count == 100) {
                break;
            }

        }

        System.out.println("Count of ships: " + count);
        System.out.println("Time to go!");
    }
}
