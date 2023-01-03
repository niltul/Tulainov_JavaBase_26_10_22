package com.hillel.tulainov.homeworks.homework13;

public class Burger {

    String bun;
    String meat;
    String mayo;
    String greens;
    String secondMeat;
    boolean isDouble = false;
    boolean isDiet = false;

    public Burger(String bun, String meat, String mayo, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.mayo = mayo;
        this.greens = greens;

        print();
    }

    public Burger(String bun, String meat, String greens) {
        isDiet = true;
        this.greens = greens;
        this.meat = meat;
        this.bun = bun;

        print();
    }
    
    public Burger(String bun, String meat, String greens, String secondMeat, String mayo) {
        isDouble = true;
        this.bun = bun;
        this.meat = meat;
        this.greens = greens;
        this.secondMeat = secondMeat;
        this.mayo = mayo;

        print();
    }

    public void print() {

        if (isDouble) {
            System.out.println("Composition of double burger: " + bun + " " +
                    meat + " " + mayo + " " + greens + " " + secondMeat);
        } else if (isDiet) {
            System.out.println("Composition of diet burger: " + bun + " " +
                    meat + " " + greens);
        } else {
            System.out.println("Composition of burger: " + bun + " " +
                    meat + " " + mayo + " " + greens);
        }
    }

}
