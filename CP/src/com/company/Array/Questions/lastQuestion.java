package com.company.Array.Questions;

import java.util.Scanner;

public class lastQuestion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
            for (int i = 0; i <n ; i++) {
                int v=s.nextInt();
                min=Math.min(min,v);
                max=Math.max(max,v);
            }
            int diff=Integer.MAX_VALUE;
            boolean temp=true;
            while (temp){
                diff=Math.min(max-min,diff);
                

            }
            System.out.println(diff);
        }
    }
}
