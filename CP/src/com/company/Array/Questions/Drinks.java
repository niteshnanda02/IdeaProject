package com.company.Array.Questions;

import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum+=s.nextInt();
        }
        System.out.println(1.*sum/n);
    }
}
