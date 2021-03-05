package com.company.Array.countsum;

import java.util.Scanner;

public class repeatedNumberOn {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n+1];
        boolean[] count=new boolean[n+1];
        boolean flag=false;
        for (int i = 0; i <n ; i++) {
            a[i]=s.nextInt();
            if (count[a[i]]){
                flag=true;
                break;
            }else {
                count[a[i]]=true;
            }

        }
        if (flag)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
