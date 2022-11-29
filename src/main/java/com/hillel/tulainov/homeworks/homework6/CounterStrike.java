package com.hillel.tulainov.homeworks.homework6;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of first team:");
        String firstTeamName = scanner.nextLine();

        System.out.println("Enter the count of frags of first player:");
        int firstFirst = scanner.nextInt();

        System.out.println("Enter the count of frags of second player:");
        int secondFirst = scanner.nextInt();

        System.out.println("Enter the count of frags of third player:");
        int thirdFirst = scanner.nextInt();

        System.out.println("Enter the count of frags of fourth player:");
        int fourthFirst = scanner.nextInt();

        System.out.println("Enter the count of frags of fifth player:");
        int fifthFirst = scanner.nextInt();

        int averageFirstTeam = (fifthFirst + secondFirst +
                thirdFirst + fourthFirst + fifthFirst) / 5;


        scanner.nextLine();

        System.out.println("Enter the name of second team");
        String secondTeamName = scanner.nextLine();

        System.out.println("Enter the count of frags of first player:");
        int firstSecond = scanner.nextInt();

        System.out.println("Enter the count of frags of second player:");
        int secondSecond = scanner.nextInt();

        System.out.println("Enter the count of frags of third player:");
        int thirdSecond = scanner.nextInt();

        System.out.println("Enter the count of frags of fourth player:");
        int fourthSecond = scanner.nextInt();

        System.out.println("Enter the count of frags of fifth player:");
        int fifthSecond = scanner.nextInt();

        int averageSecondTeam = (firstSecond + secondSecond +
                thirdSecond + fourthSecond + fifthSecond) / 5;

        if (averageFirstTeam > averageSecondTeam) {
            System.out.println("Перемогла команда " + firstTeamName +
                    ", яка набрала " + averageFirstTeam + " очків");
        } else if (averageSecondTeam > averageFirstTeam) {
            System.out.println("Перемогла команда " + secondTeamName +
                    ", яка набрала " + averageSecondTeam + " очків");
        } else {
            System.out.println("Нічия!");
        }
    }
}