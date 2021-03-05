package com.company.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InterestingDrink {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        String l=reader.readLine();
        String[] a=l.split(" ");
        int[] arr=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=Integer.parseInt(a[i]);
        }

        Arrays.sort(arr);
        int q=Integer.parseInt(reader.readLine());
        for (int i = 0; i <q ; i++) {
            int m=Integer.parseInt(reader.readLine());
            int ans=-1;
            int L=0,R=n-1;
            while (L<=R){
                int mid=(L+R)>>1;
                if(arr[mid]<=m){
                    ans=mid;
                    L=mid+1;
                }else {
                    R=mid-1;
                }
            }
            System.out.println(ans);
        }
    }
}
