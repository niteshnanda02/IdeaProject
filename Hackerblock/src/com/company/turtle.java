package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class turtle {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int k=s.nextInt();
        int[][] arr=new int[m][n];
        count(arr,k);
    }

    private static void count(int[][] arr, int k) {
        int[] d1=new int[arr.length];
        int a=0,b=0;
        int[] d2=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                if (i==j){
                    d1[a]=arr[i][j];
                    a++;
                }
                if(i+j==arr.length-1){
                    d2[b]=arr[i][j];
                    b++;
                }
            }
        }
        System.out.println(Arrays.toString(d1));
        System.out.println(Arrays.toString(d2));
        ArrayList<Integer> list=new ArrayList<>();

        int c1=dis(d1,k,list);
        int c2=dis(d2,k,list);
        System.out.println(c1+c2);
    }

    private static int dis(int[] d1,int k,ArrayList<Integer> list) {
        int c=0;
        for (int i = 0; i <d1.length ; i++) {
            for (int j = i+1; j <d1.length ; j++) {
                if (d1[i]==1&&d1[j]==1){
                    if(j-i<=k){
                        list.add(i+j);
                        break;
                    }
                }
            }
        }
        return list.size();
    }

}
