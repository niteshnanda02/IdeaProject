package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt(),m=s.nextInt(),a=s.nextInt();
        long a1=0;
        if(n%a==0){
            a1=n/a;
        }else {
            a1=n/a;
            a1++;
        }
        long a2=0;
        if(m%a==0){
            a2=m/a;
        }else {
            a2=m/a;
            a2++;
        }

        System.out.println(a1*a2);
    }
}
