package com.company.DivideAndConquer;

import java.util.Scanner;

public class NsqrtRoot {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println(Nroot(s.nextInt(),s.nextInt()));
    }

    private static double Nroot(int x, int n) {
        double low,high;
        if(x>=0&&x<=1){
            low=x;
            high=1;
        }else {
            low=1;
            high=x;
        }

        double epsilon=0.00000001;

        double guess=low+(high-low)/2;

        while (Math.abs(Math.pow(guess,n)-x)>=epsilon){

            if(Math.pow(guess,n)>x){
                high=guess;
            }else {
                low=guess;
            }

            guess=low+(high-low)/2;
        }
        return guess;
    }
}
