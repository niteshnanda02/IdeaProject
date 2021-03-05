package com.company.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class longestPrimeSubArray {
    static boolean[] array=new boolean[1000002];
    private static void seive(){
        Arrays.fill(array,true);
        array[0]=false;
        array[1]=false;
        for (int i = 2; i <=1000000 ; i++) {
            if (array[i]){
                for (int j = 2*i; j <=1000000 ; j+=i) {
                    array[j]=false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a={1, 2, 4, 3, 29,
                11, 7, 8, 9};
        seive();
        int max=0,curr=0;
        for (int i = 0; i <a.length ; i++) {
            if (array[a[i]]){
                curr++;
            }else {
                curr=0;
            }
            if (curr>max){
                max=curr;
            }
        }
        System.out.println(max);
    }
}
