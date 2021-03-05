package com.company.String;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class minSquare {
    public static void main(String[] args) {
        String s="abbccc";
        int k=2;
        System.out.println(min(s,k));
    }

    private static int min(String s, int k) {
        int l=s.length();
        if (k>=l)
            return 0;

        int[] frequency=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            frequency[s.charAt(i)-'a']++;
        }

        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1>i2)
                    return -1;
                else if (i1<i2)
                    return 1;
                else
                    return 0;
            }
        });
        for (int i = 0; i <26 ; i++) {
            if (frequency[i]!=0)
                queue.add(frequency[i]);
        }
        while (k!=0){
            int temp=queue.peek();
            queue.remove();
            temp--;
            if (temp!=0)
                queue.add(temp);
            k--;
        }
        int res=0;
        while (!queue.isEmpty()){
            int temp=queue.peek();
            res+=temp^2;
            queue.poll();
        }
        return res;
    }
}
