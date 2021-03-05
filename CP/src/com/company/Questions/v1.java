package com.company.Questions;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class v1 {
    public static void main(String[] args) {
        System.out.println(solve(5,new int[]{-1,2,3,4,-5}));
    }

    private static int solve(int n, int[] a) {
        int sum=0,sub=0;
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1-integer;
            }
        });
        for (int i = 0; i <n ; ) {
            if(a[i]>0){
                sum+=a[i];
                i++;
            }else{
                int curr=0;
                while (i<n){
                    if(a[i]<0){
                        curr+=Math.abs(a[i]);
                        i++;
                    }else {
                        break;
                    }
                }
                queue.add(curr);
            }
        }
        if(queue.size()>0){
            sum+=queue.poll();
        }
        while (!queue.isEmpty()){
            sub+=queue.poll();
        }
        return sum-sub;
    }
}
