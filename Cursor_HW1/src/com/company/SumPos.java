package com.company;

import java.util.Arrays;

public class SumPos {
    public static void main (String[] args) {
        Integer[] array = { -5, 8, 4, 1, -3 };
        System.out.println ("Array: " + Arrays.toString (array));
        int sum = 0;
        for (Integer i : array)
            if (i > 0) {
                sum = sum + i;
            }
        System.out.println ("Sum of positive = " + sum);
        System.out.println ("\n");
    }
}
