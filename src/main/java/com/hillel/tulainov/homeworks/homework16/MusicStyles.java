package com.hillel.tulainov.homeworks.homework16;

public class MusicStyles {

    private String musiciansName;

    public MusicStyles(String musiciansName) {
        this.musiciansName = musiciansName;
    }

    public String getMusiciansName() {
        return musiciansName;
    }

    public void playMusic() {
        System.out.println("Music is playing!");
    }
}
