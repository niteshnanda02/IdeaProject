package com.company.Questions;

import java.util.Scanner;

public class BuyAndSell {
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=s.nextInt();
            int B=0,S=0;
            for(int i=1;i<n;i++){
                if(a[i]<a[S]){
                    if(B<S){
                        System.out.print("("+B+" "+S+") ");
                    }
                    B=i;
                    if(i<n-1){
                        S=i+1;
                    }
                }
                if(a[i]>a[S]){
                    S=i;
                }
                if(a[i]<a[B]){
                    B=i;
                }
            }
            if(B<S){
                    System.out.print("("+B+" "+S+") ");
            }else{
                System.out.print("No Profit");
            }
            System.out.println();
        }
    }
}
