package com.company.Questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class v4 {
    static class pair implements Comparable<pair>{
        int s, d;

        public pair(int s, int d) {
            this.s = s;
            this.d = d;
        }

        @Override
        public int compareTo(pair pair) {
            return this.s -pair.s;
        }


    }
    private static int solve(int input1,int[] input2,int[] input3){
        pair[] pairs=new pair[input1];
        for (int i = 0; i <input1 ; i++) {
            pair p=new pair(input2[i],input3[i]);
            pairs[i]=p;
        }
        Arrays.sort(pairs);

        int ans=0;
        for (int i = 0; i <input1 ; i++) {
            if(pairs[i].s>ans)
                ans=pairs[i].s;
            ans+=pairs[i].d;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(solve(5,new int[]{0,3,3,2,6},new int[]{3,4,2,9,6}));
    }
}
