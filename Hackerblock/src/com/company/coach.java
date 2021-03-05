package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class coach {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int[] a={n};
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int c=0;
        for(int i = 0 ; i < t ; i++) {
            long ac1 = sc.nextLong();
            long ac2 = sc.nextLong();
            long ac3 = sc.nextLong();
            long sl = sc.nextLong();
            long gn = sc.nextLong();
            /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */

            check(ac1,ac2,ac3,sl,gn);

        }
//        int[] arr={1 ,2 ,3 ,6 ,10};
//        System.out.println(train(arr));
    }

    private static void check(long ac1, long ac2, long ac3, long sl, long gn) {
        int c=0;
        while (ac1>0&&ac2>0&&ac3>0&&sl>0&&gn>0){
            ac1--;
            ac2-=2;
            ac3-=3;
            sl-=6;
            gn-=10;
            if (ac1>=0&&ac2>=0&&ac3>=0&&sl>=0&&gn>=0){
                c++;
            }
        }
        System.out.println(c);
    }

    private static int train(int[] arr) {
        int[] ch={1,2,3,6,10};
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {

                arr[j]=arr[j]-ch[j];
                if (arr[j]<0){
                    return c;
                }
            }
            c++;

        }
        return c;
    }
}
