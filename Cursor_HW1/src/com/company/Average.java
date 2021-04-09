package com.company;

import java.util.Arrays;

public class Average {
    public static void main (String[] args) {
        Integer[] array = { 2, 4, 5, 9, 3 };
        System.out.println ("Array: " + Arrays.toString (array));
        double avg = 0;
        for (Integer i : array) {
            avg = avg + i;
        }
        avg = avg / array.length;
        System.out.println ("Average is: " + avg);
        System.out.println ("\n");
    }
}
