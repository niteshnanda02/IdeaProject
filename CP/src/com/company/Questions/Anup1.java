package com.company.Questions;

import java.util.*;

public class Anup1 {

    static int smallest_pair(int[] a,int n){
        int sum=0;
        Arrays.sort(a);
        sum=a[0]+a[1];
        return sum;
    }
    public static void main(String[] args) {
            int[] a={56, 94, 35};
        System.out.println(smallest_pair(a,a.length));
    }


}
