package com.company;

import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            double k=s.nextInt();
            double[] p=new double[n];
            for (int i = 0; i <n ; i++) {
                p[i]=s.nextDouble();
            }
            double prefSum=p[0],x=0,ans=0;
            for (int i = 1; i <n ; i++) {
                if((p[i]/(prefSum))<=(k/100.0)){
                }else{
                    x=Math.ceil(((p[i]*100.0)/k)-prefSum);
                    prefSum+=x;
                    ans+=x;
                }
                prefSum+=p[i];

            }
            System.out.println((long) ans);
        }
    }


}
