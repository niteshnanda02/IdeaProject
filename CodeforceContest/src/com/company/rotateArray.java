package com.company;

import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(ar,4)));
    }
    static int[] rotLeft(int[] a, int d) {
        int t=a[0];
        for(int i=0;i<d;i++)
            a[i]=a[i+1];
        a[a.length-1]=t;
        return a;

    }
}
