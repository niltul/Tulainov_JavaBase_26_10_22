package com.hillel.tulainov.homeworks.homework12;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "231123123132"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37479874995"));
    }

    public static String personInfo(String name, String surname, String city,
                             String phoneNum) {

        return "To call " + name + " " + surname +
                " from " + city + " you should call "
                + phoneNum;
    }
}
