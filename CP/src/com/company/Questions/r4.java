package com.company.Questions;

import java.util.Arrays;

public class r4 {
        public static int minPenalty(int input1,int[] input2){
            Arrays.sort(input2);
            int ans=0;
            for (int i = input1-1; i >0 ; i--) {
                ans+=input2[i]-input2[i-1];
            }
            return ans;
        }

    public static void main(String[] args) {
        System.out.println(minPenalty(4,new int[]{1,6,-2,4}));
    }
}
