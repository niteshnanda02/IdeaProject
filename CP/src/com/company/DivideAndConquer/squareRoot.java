package com.company.DivideAndConquer;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(squareRoot(s.nextInt()));
    }
    private static int squareRoot(int x){
        if(x==0||x==1)
            return x;
        int l=0,r=x,ans=0;
        while (l<=r){
            int mid=l+(r-l)/2;
            if(mid*mid==x)
                return mid;

            if((mid*mid)<x){
                ans=mid;
                l=mid+1;
            }else {
                r=mid-1;
            }
        }
        return ans;
    }

}
