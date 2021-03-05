package com.company.Array.Questions;

import java.util.Arrays;

public class NegativeNumber {
    public static void main(String[] args) {
        int[] a={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        sort(a,a.length);
        System.out.println(Arrays.toString(a));
    }
    static void sort(int[] a,int n){
        int low=0,high=n-1;
        for (int i = low; i <=high ; ) {
            if(a[i]<0){
               swap(a,i,low);
               low++;
               i++;
            }else if(a[i]>0){
                swap(a,i,high);
                high--;
            }else{
                i++;
            }
        }
    }
    static void swap(int[] a,int i,int j){
        int t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}
