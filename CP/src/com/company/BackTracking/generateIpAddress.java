package com.company.BackTracking;

import java.util.Scanner;

public class generateIpAddress {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            String str=s.next();
            solve(str,1,4);
        }
    }

    private static void solve(String str, int index, int dots) {
        if(dots==0){
            System.out.println(str);
            return;
        } if(index>=str.length())
            return;

        for (int i = index; i <str.length()-1 ; i++) {
            str=str.substring(0,i)+"."+str.substring(i);
            solve(str,index+1,dots-1);
            str=str.substring(0,i)+str.substring(i+1);
        }
    }
}
