package com.company;

import java.util.Scanner;

public class A_GradeAllocation {
    public static void main(String[] args) {
        // write your code here
        Scanner s=new Scanner(System.in);
        try {
            int t=s.nextInt();

            while (t>0){
                int n=s.nextInt();
                int m=s.nextInt();
                int[] arr=new int[n];
                for (int i = 0; i <n ; i++) {
                    arr[i]=s.nextInt();
                }

                int ans=check(arr,m,n);
                System.out.println(ans);
                t--;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static int check(int[] arr, int m, int n) {
        int left=sum(arr)-m;
        arr[0]=m;
        for (int i = 1; i <n-1 ; i++) {

            if(left>0){
                arr[i]=1;
                left--;
            }else {
                arr[i]=0;
            }
        }
        arr[n-1]=left;
        return  arr[0];
    }
    private static int sum(int[] arr){
        int c=0;
        for (int i = 0; i <arr.length ; i++) {
            c+=arr[i];
        }
        return c;
    }
}

