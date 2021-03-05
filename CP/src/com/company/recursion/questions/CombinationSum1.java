package com.company.recursion.questions;

import java.util.*;

public class CombinationSum1 {
    public static void main(String[] args) {
        System.out.println(new Solution().combinationSum(new int[]{2,3,5},8));
    }
}
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();

        combinationSum(candidates,target,0,curr,res);
        return res;
    }

    private void combinationSum(int[] candidates, int target, int startIndex, List<Integer> curr, List<List<Integer>> res) {
        if (target<0){
            return;
        }
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }

        for (int i = startIndex; i < candidates.length; i++) {
            if(candidates[i]>target)
                continue;

            curr.add(candidates[i]);
            combinationSum(candidates,target-candidates[i],i,curr,res);

            curr.remove(curr.size()-1);

        }
    }
}