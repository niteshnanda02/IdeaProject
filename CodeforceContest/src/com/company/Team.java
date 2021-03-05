package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt();
        int ans=0;
        for (int i = 0; i <n ; i++) {
            int p1=s.nextInt(),p2=s.nextInt(),p3=s.nextInt();
            if(((p1&p2)&p3)==1){
                ans++;
            }else if((p1&p2)==1){
                ans++;
            }else if((p2&p3)==1){
                ans++;
            }else if((p1&p3)==1){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
