package com.company.BinarySearch;

import java.util.Scanner;

public class FindKRotation {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
        }
        System.out.println(findKRotation(a,n));
    }
    static int findKRotation(int arr[], int n) {
        // code here
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            int next=(mid+1)%n;
            int prev=(mid-1+n)%n;
            if(arr[mid]<=arr[prev]&&arr[mid]<=arr[next])
                return mid;
            else if(arr[mid]<=arr[e]){
                e=mid-1;
            }else if(arr[s]<=arr[mid]){
                s=mid+1;
            }
        }
        return 0;
    }
}
