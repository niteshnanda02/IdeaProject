package com.company.Questions;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        int max= Arrays.stream(nums).max().getAsInt();
        boolean[] c=new boolean[max+1];
        for (int i = 0; i <nums.length ; i++) {
            c[nums[i]]=true;
        }
        int ans=0,f=0;

        for (int i = 0; i <=max ; i++) {
            if(c[i]){
                f++;
                if(f>ans){
                    ans=f;
                }
            }else {
                f=0;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
