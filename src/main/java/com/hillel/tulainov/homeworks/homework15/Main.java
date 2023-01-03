package com.hillel.tulainov.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        Androids samsung = new Androids("Samsung A01");
        iPhones iPhone = new iPhones("iPhone11");

        System.out.println(samsung.call());
        System.out.println(samsung.sms());
        System.out.println(samsung.internet());
        System.out.println(samsung);

        System.out.println();

        System.out.println(iPhone.call());
        System.out.println(iPhone.sms());
        System.out.println(iPhone.internet());
        System.out.println(iPhone);

    }
}
