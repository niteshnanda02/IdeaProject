package com.company.Array.countsum;

import java.util.Scanner;

public class intcountsum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n+1];
        int[] count=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=s.nextInt();
            count[a[i]]++;
        }

        for (int i = 0; i <=n ; i++) {
            int v=count[i];
            while (v>0){
                System.out.print(i+" ");
                v--;

            }
        }
    }
}
