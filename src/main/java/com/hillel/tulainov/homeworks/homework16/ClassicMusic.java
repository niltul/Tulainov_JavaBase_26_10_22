package com.hillel.tulainov.homeworks.homework16;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String musiciansName) {
        super(musiciansName);
    }

    @Override
    public void playMusic() {
        System.out.println(getMusiciansName() + " plays!");
    }
}
