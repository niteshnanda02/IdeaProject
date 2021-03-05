package com.company.Questions;

import java.util.Arrays;

public class Twosum {

    public static int[] twoSum(int[] nums, int target) {
        int f=0,s=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]+nums[j]==target){
                        f=i;
                        s=j;
                        break;
                    }
                }
            }
        }
        System.out.println(f+" "+s);
        int[] ans=new int[2];
        ans[0]=f;
        ans[1]=s;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15},9)));
    }
}

