package com.hillel.tulainov.homeworks.homework14;

public class Main {
    public static void main(String[] args) {

        FitnessTracker frodo = new FitnessTracker("Frodo", "Baggins", 22, 9,
                2001, "lord_of_the_ring@gmail.com", "+49948181616", 60,
                "130/85", 35000);

        FitnessTracker jon = new FitnessTracker("Jon", "Snow", 15, 12, 1992,
                "know.nothing.at.all@gmail.com", "+94891519648", 77, "125/79",
                20987);

        FitnessTracker luffy = new FitnessTracker("Luffy", "Monkey D.", 5, 5,
                1997, "pirate_king@gmail.com", "+1565168494", 65, "120/65",
                31065);

        FitnessTracker harry = new FitnessTracker("Harry", "Potter", 31, 7, 1980,
                "potter@hogwarts.uk", "+498498116", 81, "126/65", 6523);

        FitnessTracker naruto = new FitnessTracker("Naruto", "Uzumaki", 10, 10,
                1999, "best_hokage@kanoha.com", "89498984", 70,
                "128/71", 13200);

        frodo.printAccountInfo();
        System.out.println();

        jon.printAccountInfo();
        System.out.println();
        jon.setSurname("Targarien");
        jon.printAccountInfo();
        System.out.println();

        luffy.printAccountInfo();
        System.out.println();

        harry.printAccountInfo();
        System.out.println();

        naruto.printAccountInfo();
    }
}
