package com.hillel.tulainov.homeworks.homework5;

public class ChineseDynasties {
    public static void main(String[] args) {

        int warriorLi = 13;
        int archerLi = 24;
        int riderLi = 46;

        int armyLi = 860;

        int warriorsPowerLi = warriorLi * armyLi;
        int archersPowerLi = archerLi * armyLi;
        int ridersPowerLi = riderLi * armyLi;

        int sumPowerLi = warriorsPowerLi + archersPowerLi + ridersPowerLi;

        System.out.println("Dynasty Li power = " + sumPowerLi);

        int warriorMin = 9;
        int archerMin = 35;
        int riderMin = 12;

        int armyMin = armyLi + (armyLi / 2);

        int warriorsPowerMin = warriorMin * armyMin;
        int archersPowerMin = archerMin * armyMin;
        int ridersPowerMin = riderMin * armyMin;

        int sumPowerMin = warriorsPowerMin + archersPowerMin + ridersPowerMin;

        System.out.println("Dynasty Min power = " + sumPowerMin);

    }
}
