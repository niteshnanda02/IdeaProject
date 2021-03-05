package com.company.Questions;

import java.util.Arrays;
import java.util.Scanner;

public class simran1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] cnt=new int[n];
        for (int i = 0; i <n ; i++) {
            cnt[i]=s.nextInt();
        }
        Arrays.sort(cnt);
        int i=0,j=n-1;
        while (i<=j){
            if(i==j){
                System.out.println(cnt[i]+" "+0);
            }else{
                System.out.println(cnt[j]+" "+cnt[i]);
            }
            i++;
            j--;
        }
    }
}
