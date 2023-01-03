package com.hillel.tulainov.homeworks.homework14;

public class FitnessTracker {

    private final String name;
    private final int dayBirth;
    private final int monthBirth;
    private final int yearBirth;
    private final String email;
    private final String phoneNumber;
    private int age;
    private String surname;
    private int weight;
    private String pressure;
    private int stepsCount;


    public FitnessTracker(String name, String surname, int dayBirth, int monthBirth, int yearBirth,
                          String email, String phoneNumber, int weight,
                          String pressure, int stepsCount) {

        this.name = name;
        this.surname = surname;
        this.dayBirth = dayBirth;
        this.monthBirth = monthBirth;
        this.yearBirth = yearBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsCount = stepsCount;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return countAge();
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSurname() {
        return surname;
    }

    public int getWeight() {
        return weight;
    }

    public String getPressure() {
        return pressure;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setStepsCount(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    private int countAge() {
        return 2020 - yearBirth;
    }

    public void printAccountInfo() {
        System.out.println("Person's info:");
        System.out.println("Name and surname: " + name + " " + surname +
                "\nDate of birth: "  + dayBirth + "." + monthBirth + "." + yearBirth +
                "\nAge: " + getAge() +
                "\nEmail: " + email +
                "\nPhone number: " + phoneNumber +
                "\nWeight: " + weight +
                "\nPressure: " + pressure +
                "\nCount of steps: " + stepsCount);
    }
}
