package com.hillel.tulainov.homeworks.homework4;

public class Parallelepiped {
    public static void main(String[] args) {

        int aSide = 12;
        int bSide = 7;
        int cSide = 9;

        int volume = aSide * bSide * cSide;
        int length = 4 * (aSide + bSide + cSide);

        System.out.println("Volume = " + volume);
        System.out.println("Length = " + length);
    }
}
