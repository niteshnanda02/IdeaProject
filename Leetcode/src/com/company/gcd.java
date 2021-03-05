package com.company;

import java.awt.*;
import java.awt.List;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.size());

        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        String c=s.next();
        for (int i = 0; i <t ; i++) {
            int n=s.nextInt();
            int[] arr=new int[n];
            for (int j = 0; j <n ; j++) {
                arr[j]=s.nextInt();
            }
            ArrayList<Integer> list=new ArrayList<>();
            for (int j = 0; j <n-1 ; j++) {
                    list.add(check(arr,j,n));
            }
            int ans=max(list);
            System.out.println(ans);
        }
    }

    private static Integer check(int[] arr, int i, int j) {
        int l=low(arr,i,j);
        int g=0;
        for (int k = 1; k <=l ; k++) {
            boolean vl=div(arr,k,i,j);
            if(vl){
                g=k;
            }
        }
        return g;
    }

    private static boolean div(int[] arr, int k1, int I, int j) {
        for (int i = I; i <j ; i++) {
            if(arr[i]%k1!=0){
                return false;
            }
        }
        return true;
    }

    private static int low(int[] arr, int i, int j) {
        int max=arr[i];
        for (int k = i; k <j ; k++) {
            if (max>arr[k]){
                max=arr[k];
            }
        }
        return max;
    }

    private static int max(ArrayList<Integer> list) {
        int max=list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if (max<list.get(i)){
                max=list.get(i);
            }
        }
        return max;
    }

}
