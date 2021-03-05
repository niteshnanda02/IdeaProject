package com.company.Array.Questions;

import java.util.Scanner;

public class Hierarichal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            long x=s.nextLong(),y=s.nextLong();
            solve(x,y);
        }
    }

    private static void solve(long x, long y) {
        long c=0;
        while (x>0||y>0){
            if(x==y){
                System.out.println(c);
                return;
            }
            if(x/2==y/2){
                x/=2;
                y/=2;
                c+=2;
            }
            else if(x>y){
                x=x/2;
                c++;
            }else {
                y=y/2;
                c++;
            }
        }
    }
}
