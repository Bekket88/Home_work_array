package com.company;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = new int[3]; // задача 1
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;
        float[] secondArray = {1.57f, 7.654f, 9.986f};
        int[] myArray = {1, 8, 11, 3, 6, 17};

        for (int i = 0; i < firstArray.length; i++) { // Задача 2
            if (i == firstArray.length - 1) {
                System.out.print(firstArray[i]);
            }
            else{
                System.out.print(firstArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray.length - 1){
                System.out.print(secondArray[i]);
            }
            else {
                System.out.print(secondArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            if (i == myArray.length - 1) {
                System.out.print(myArray[i]);
            }
            else {
                System.out.print(myArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = firstArray.length - 1; i >= 0; i--) { // Задача 3
            if (i == 0) {
                System.out.print(firstArray[i]);
            }
            else {
                System.out.print(firstArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = secondArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(secondArray[i]);
            }
            else {
                System.out.print(secondArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = myArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(myArray[i]);
            }
            else {
                System.out.print(myArray[i] + ", ");
            }
        }
        System.out.println();
        for (int i = 0; i < firstArray.length; i++) { // задача 4. попробовал код на массиве myArray. Программа работает корректно.
            if (firstArray[i] % 2 != 0) {
                firstArray[i] = firstArray[i] + 1;
                System.out.println(firstArray[i]);
            }
            else
                System.out.println(firstArray[i]);
        }
    }
}
