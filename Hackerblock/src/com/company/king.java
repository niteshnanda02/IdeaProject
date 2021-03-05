package com.company;

import java.util.Scanner;

public class king {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        String k1;
        k1=s.nextLine();
        String k2=s.nextLine();
        int j=s.nextInt();
        name(n,k1,k2,j);


    }

    private static void name(int n, String k1, String k2, int j) {
        if ((n>=3&&n<=40)&&(k1.length()>=1&&k1.length()<=5)&&(k2.length()>=1&&k2.length()<=5)&&(j>=1&&j<=(int)Math.pow(10,18))){
            String k="";

            for (int i = 2; i <n; i++) {
                String a1=k2.concat(k2);
                k=k1.concat(a1);
                k1=k2;
                k2=k;
            }
            System.out.println(k);
            if (j<=k.length()){
                System.out.println(k.charAt(j-1));
            }else {
                System.out.println(-1);
            }
        }else {
            System.out.println(-1);
        }

    }
}
