package com.hillel.tulainov.lessons.multiArr;


public class Main {
    public static void main(String[] args) {

//
//        int[][] array = new int[5][5];
//
////        for (int i = 0; i < array.length; i++) {
////            for (int j = 0; j < array[i].length; j++) {
////                if (i == j) {
////                    array[i][j] = 1;
////                }
////            }
////        }
//
////        for (int i = 0; i < array.length; i++) {
////            array[i][i] = 1;
////        }
////
////
////        for (int[] ints : array) {
////            for (int anInt : ints) {
////                System.out.print(anInt + "\t");
////            }
////            System.out.println();
////        }
//
//        int[][] array1 = new int[5][5];
//        for (int i = 0; i < array1.length; i++) {
//            array1[i][array1.length - i - 1] = 1;
//        }
//
//        for (int[] ints : array1) {
//            for (int anInt : ints) {
//                System.out.print(anInt + "\t");
//            }
//            System.out.println();

//          WRONG!!!!!!!!!
//

//
//        for (int i = 0; i < array1.length; i++) {
//            for (int j = 0; j < array1[i].length; j++) {
//                array1[i][j] = (int) (Math.random() * 11);
//            }
//        }

//        int[][] array = new int[7][7];

        int[][] array1 = new int[4][2];
        int[][] array2 = new int[2][4];

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int) (Math.random() * 11);
            }
        }

        System.out.println("BEFORE");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < array2.length; i++) {
            for (int j = i + 1; j < array2[i].length; j++) {
                int temp = array1[j][i];
                array2[j][i] = array1[j][i];
                array2[i][j] = temp;
            }
        }

        System.out.println("AFTER");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
