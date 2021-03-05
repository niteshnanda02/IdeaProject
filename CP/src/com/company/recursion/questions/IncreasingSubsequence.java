package com.company.recursion.questions;

import java.util.Scanner;

public class IncreasingSubsequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int k=s.nextInt(),n=s.nextInt();
        print(k,n);
    }

    private static void print(int k, int n) {
        int[] arr=new int[n];

        printUtil(k,n,0,arr);
    }

    private static void printUtil(int k, int n, int len, int[] arr) {
        if(len==k){
            display(arr,k);
            return;
        }
        //if len is zero its mean it's a start element
        int i=(len==0)?1:arr[len-1]+1;

        len++;

        while (i<=n){
            arr[len-1]=i;
            printUtil(k,n,len,arr);
            i++;
        }

        //finally remove the last element for the change in the value
    }

    private static void display(int[] arr, int k) {
        for (int i = 0; i <k ; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}
