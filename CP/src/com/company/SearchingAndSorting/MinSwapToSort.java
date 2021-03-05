package com.company.SearchingAndSorting;

import java.util.Arrays;

public class MinSwapToSort {
    public static void main(String[] args) {
        int[] a={2,2,3,5,7,7};
        System.out.println(bs(a,0,a.length-1,1));
    }
    static int bs(int[] a,int l,int h,int d){
        int ans=h;
        while(l<=h){
            int m=l+(h-l)/2;
            if(a[m]==d){
                ans=m;
                l=m+1;
            }else if(a[m]<d){
                l=m+1;
            }else{
                h=m-1;
                ans=h;
            }
        }
        return ans;
    }
}
