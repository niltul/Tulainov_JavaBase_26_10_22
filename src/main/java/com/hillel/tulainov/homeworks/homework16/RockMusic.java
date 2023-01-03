package com.hillel.tulainov.homeworks.homework16;

public class RockMusic extends MusicStyles{

    public RockMusic(String musiciansName) {
        super(musiciansName);
    }

    @Override
    public void playMusic() {
        System.out.println(getMusiciansName() + " plays!");
    }
}
