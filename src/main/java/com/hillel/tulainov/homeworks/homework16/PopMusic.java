package com.hillel.tulainov.homeworks.homework16;

public class PopMusic extends MusicStyles{


    public PopMusic(String musiciansName) {
        super(musiciansName);
    }

    @Override
    public void playMusic() {
        System.out.println(getMusiciansName() + " plays!");
    }
}
