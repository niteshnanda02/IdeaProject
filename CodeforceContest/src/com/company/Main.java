package com.company;
import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int n=s.nextInt(),k=s.nextInt();
        int count=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int val=0;
        if(k<n){
            val=arr[k-1];
            for(int i=0;i<n;i++){
                if(arr[i]>=val&&arr[i]>0){
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}