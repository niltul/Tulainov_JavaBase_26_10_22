package com.hillel.tulainov.homeworks.homework16;

public class Main {
    public static void main(String[] args) {

        PopMusic popMusic = new PopMusic("Harry Styles");
        RockMusic rockMusic = new RockMusic("System of a down");
        ClassicMusic classicMusic = new ClassicMusic("Ludovico Einaudi");

        MusicStyles[] musicStyles = {popMusic, rockMusic, classicMusic};

        for (MusicStyles style : musicStyles) {
            style.playMusic();
        }
    }
}
