package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int a=s.nextInt(),b=s.nextInt();
            int ans=check(a,b);
            System.out.println(ans);
        }
    }

    private static int check(int a, int b) {
        if (a%b==0){
            return 0;
        }
        int val=a%b;
        int ans=b-val;
        return ans;
    }
}
