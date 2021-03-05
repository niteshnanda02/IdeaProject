package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Codejam4 {
    public static void main(String[] args) {
        int t=0;
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        t=s.nextInt();
        for (int i = 1; i <=t ; i++) {
            System.out.println("Case #"+i+": ");
        }
    }
}
