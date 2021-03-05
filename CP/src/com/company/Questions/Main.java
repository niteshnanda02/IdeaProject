package com.company.Questions;
import java.util.*;
import java.util.stream.*;

public class Main {

    static Scanner scn = new Scanner(System.in);

    public static int[][] takeInput() {
        Scanner scn = new Scanner(System.in);
        int arr[][] = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for(int j = 0;j<4;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }


    static void spiralPrint(int m, int n, int a[][])
    {
        //write your code here
        int l=0,t=0,r=a[0].length-1,b=a.length-1;
        while(l<=r&&t<=b){
            for(int i=l;i<=r;i++)
                System.out.print(a[t][i]+" ");
            t++;
            for(int i=t;i<=b;i++)
                System.out.print(a[i][r]+" ");
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--)
                    System.out.print(a[b][i]+" ");
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--)
                    System.out.print(a[i][l]+" ");
                l++;
            }
        }
    }



    public static void main(String[] args) {
        int[][] arr = takeInput();
        spiralPrint(4,4,arr);
    }
}