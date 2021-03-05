package com.company.greedy;

import java.util.Arrays;
import java.util.TreeSet;

public class maxMoney {
    private static class job implements Comparable<job> {
        int id, deadline, profit;

        public job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public int compareTo(job job) {
            return job.profit- this.profit;
        }
    }
    public static int maxMoney(int input1,int[] input2,int[] input3){
        job[] jobs = new job[input1];
        for (int i = 0; i <input1 ; i++) {
            job job = new job(i+1, input3[i], input2[i]);
            jobs[i] = job;
        }
        Arrays.sort(jobs);
        int ans=0;
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = jobs.length-1; i >=0 ; i--) {
            if(!set.contains(jobs[i].deadline)){
                set.add(jobs[i].deadline);
                ans+= jobs[i].profit;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(maxMoney(3,new int[]{60,40,80},new int[]{1,2,2}));
    }
}
