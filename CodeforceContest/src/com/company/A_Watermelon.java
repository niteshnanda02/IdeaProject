package com.company;

import java.util.Scanner;

public class A_Watermelon {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int w = s.nextInt();
        if (w % 2 == 0&&w>2) {
            System.out.println("YES");
        } else
            System.out.println("NO");
    }
}
