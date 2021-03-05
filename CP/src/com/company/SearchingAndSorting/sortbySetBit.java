package com.company.SearchingAndSorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class sortbySetBit {
    static void sortBySetBitCount(Integer arr[], int n)
    {
        // Your code goes here
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {

                return Integer.compare(Integer.bitCount(t1),Integer.bitCount(integer));
            }
        });
    }

    public static void main(String[] args) {
        Integer[] a={5, 2, 3, 9, 4, 6, 7, 15, 32};
        sortBySetBitCount(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}
