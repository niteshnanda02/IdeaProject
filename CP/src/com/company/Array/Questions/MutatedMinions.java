package com.company.Array.Questions;

import java.util.Scanner;

public class MutatedMinions {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();
                int k=s.nextInt();
                int ans=0;
                for (int i = 0; i <n ; i++) {
                    int v=s.nextInt()+k;
                    if (v%7==0)
                        ans++;
                }
                System.out.println(ans);
            }
        }
    }
}
