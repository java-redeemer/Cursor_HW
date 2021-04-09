package com.company;

import java.util.Arrays;
import java.util.Collections;

public class SortDesc {
    public static void main (String[] args) {
        Integer[] array = { 2, 3, 1, 7, 11 };
        System.out.println ("Array: " + Arrays.toString (array));
        Arrays.sort (array);
        System.out.println ("Array sorted: " + Arrays.toString (array));
        Arrays.sort (array, Collections.reverseOrder ());
        System.out.println ("Array sorted by DESC: " + Arrays.toString (array));
        System.out.println ("\n");
    }
}
