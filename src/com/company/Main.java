package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    // Задание 1

        // вариант 1
        int [] first = new int [] {1, 2, 3};

        double [] second = {1.57, 7.654, 9.986};

        boolean [] third = {1>=0, false, true};


    // Задание 2

        for (int i = 0; i < first.length; i++) {
            if (i < first [1]) {
                System.out.print(first[i] + ", ");
            } else {
                System.out.print(first[i] + " ");
            }
        }
        System.out.println();

        for (int d = 0; d < second.length; d++) {
            if (d == second.length -1) {
                System.out.print(second[d] + " ");
            } else {
                System.out.print(second[d] + ", ");
            }
        }
        System.out.println();

        for (int b = 0; b < third.length; b++) {
            if (b == third.length -1) {
                System.out.print(third[b] + " ");
            } else {
                System.out.print(third[b] + ", ");
            }
        }
        System.out.println();

        // Альтернатива
        //System.out.print(Arrays.toString(first));
        //System.out.print(Arrays.toString(second));
        //System.out.print(Arrays.toString(third));


        // Задание 3

        for (int i = first.length - 1; i >= 0; i--) {
            if (i <= first.length - 3) {
                System.out.print(first[i] + " ");
            } else {
                System.out.print(first[i] + ", ");
            }
        }
        System.out.println();

        for (int i = second.length - 1; i >= 0; i--) {
            if (i <= second.length - 3) {
                System.out.print(second[i] + " ");
            } else {
                System.out.print(second[i] + ", ");
            }
        }
        System.out.println();

        for (int i = third.length - 1; i >= 0; i--) {
            if (i <= third.length - 3) {
                System.out.print(third[i] + " ");
            } else {
                System.out.print(third[i] + ", ");
            }
        }
        System.out.println();

        // Задание 4

        for (int y = 0; y < first.length; y++) {
            if (first[y] % 2 != 0) {
                first[y] = first[y] + 1;
            } else if (first[y] % 2 == 0) {
            }
            if (y < first [1]) {
                System.out.print(first[y] + ", ");
            } else {
                System.out.print(first[y] + " ");
            }
        }

        }
}
