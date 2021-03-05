package com.company.Questions;

import java.util.*;

public class nqtNitesh {
    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{-2147483648,-2147483647,2147483647}));
          }
    public static List<String> summaryRanges(int[] nums) {
        List<String> list=new ArrayList<>();
        if(nums.length==0)
            return list;
        int f=nums[0],s=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){

                s=nums[i];
            }else{
                if(f<s)
                    list.add(f+"->"+s);
                else
                    list.add(f+"");
                f=nums[i];
            }
        }
        if(f<s) {
            list.add(f + "->" + s);
        }
        else if(f==s||f!=nums[0]){
            list.add(f+"");
        }
        return list;
    }
}
