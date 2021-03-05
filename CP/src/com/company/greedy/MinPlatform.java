package com.company.greedy;

import java.util.Arrays;

public class MinPlatform {
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int i=0,j=0;
        int maxPlatform=1,needPlatform=1;
        while(i<n&&j<n){
            if(arr[i]<arr[j]){
                i++;
                maxPlatform++;
            }else{
                j++;
                maxPlatform--;
            }
            needPlatform=Math.max(maxPlatform,needPlatform);
        }


        return needPlatform;

    }

    public static void main(String[] args) {
        System.out.println(findPlatform(new int[]{900  ,940 ,950  ,1100 ,1500 ,1800},new int[]{910, 1200 ,1120 ,1130, 1900 ,2000},6));
    }
}
