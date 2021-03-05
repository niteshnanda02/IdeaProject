package com.company.DivideAndConquer;

import java.util.Scanner;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=s.nextInt();
            }
            int k=s.nextInt();
            int pivot=searchPivotElement(a,0,n-1,n);
            int elem=search(a,0,n-1,pivot,k);
            System.out.println(elem);
        }
    }

    private static int search(int[] a, int l, int h, int pivot, int k) {

        if(k>=a[pivot]&&k<=a[h]){
            return binary(a,pivot,h,k);
        }else {
            return binary(a,l,pivot-1,k);
        }
    }

    private static int searchPivotElement(int[] a, int l, int h, int n) {
        if(l>h)
            return -1;
        int m=l+(h-l)/2;
        if (m==n-1)
            return 0;
        if(a[m]>a[m+1]){
            return m+1;
        }
        //search pivot in first part
        else if(a[l]>a[m]){
            return searchPivotElement(a,l,m-1, n);
        }

        //search pivot in second part

        else {
            return searchPivotElement(a,m+1,h, n);
        }
    }

    private static int binary(int[] a,int l,int h,int elem){
        if (l>h)
            return -1;
        int mid=l+(h-l)/2;
        if(a[mid]==elem){
            return mid;
        }else if(a[mid]<elem){
            return binary(a,mid+1,h,elem);
        }else {
            return binary(a,l,mid-1,elem);
        }

    }
}
