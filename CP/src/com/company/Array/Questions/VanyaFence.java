package com.company.Array.Questions;

import java.util.Scanner;

public class VanyaFence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),h=s.nextInt();
        int c=0;
        for (int i = 0; i <n ; i++) {
            int v=s.nextInt();
            if (v>h)
                c+=2;
            else
                c++;
        }
        System.out.println(c);
    }
}
