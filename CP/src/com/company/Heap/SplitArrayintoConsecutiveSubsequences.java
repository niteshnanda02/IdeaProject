//package com.company.Heap;
//
//import java.util.HashMap;
//
//public class SplitArrayintoConsecutiveSubsequences {
//}
//class Solution {
//    public boolean isPossible(int[] nums) {
//        HashMap<Integer,Integer> fm=new HashMap<>();
//        HashMap<Integer,Integer> hm=new HashMap<>();
//
//        for(int i=0;i<nums.length;i++){
//            fm.put(nums[i],fm.getOrDefault(nums[i],0)+1);
//        }
//        for(int i:nums){
//            if(hm.getOrDefault(i,0)>0){
//                hm.put(i,hm.get(i)-1);
//                hm.put(i,hm.getOrDefault(i,0)+1);
//                fm.put(i,fm.get(i)-1);
//            }else if(fm.getOrDefault(i,0)>0&&fm.getOrDefault(i+1,0)>0&&fm.getOrDefault(i+2,0)>0){
//                fm.put(i,fm.get(i)-1);
//                fm.put(i+1,fm.get(i+1)-1);
//                fm.put(i+2,fm.get(i+2)-1);
//                hm.put(i+3,hm.getOrDefault(i+3,0)+1);
//            }else
//                return false;
//        }
//        return true;
//    }
//}