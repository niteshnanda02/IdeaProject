package com.company.SearchingAndSorting;

public class SquareRoot {
    static int sqrt(int x){
        if(x==0||x==1)
            return x;
        int ans=0;
        int l=1,r=x;
        while (l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==x)
                return mid;
            else if(mid*mid<x){
                ans=mid*mid;
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(sqrt(4));
    }
}
