package com.company;

import java.util.Arrays;

public class ReplaceDuplicates {
    public static void main (String[] args) {
        Integer[] array = { 2, 2, 8, 1, 4, 8, 8 };
        System.out.println ("Array: " + Arrays.toString (array));
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals (array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println ("Duplicates replaced with 0: " + Arrays.toString (array));
        System.out.println ("\n");
    }
}