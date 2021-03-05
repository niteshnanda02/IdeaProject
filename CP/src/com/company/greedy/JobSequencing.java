package com.company.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class    JobSequencing {
    private static class job implements Comparable<job> {
        int id, deadline, profit;

        public job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }

        @Override
        public int compareTo(job job) {
            return job.profit-this.profit;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            job[] jobs = new job[n];
            for (int i = 0; i < n; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                int c = s.nextInt();
                job job = new job(a, b, c);
                jobs[i] = job;
            }
            Arrays.sort(jobs);
            int max = max(jobs, n);
            TreeSet<Integer> set = new TreeSet<>();
            for (int i = 0; i < max; i++) {
                set.add(i);
            }
            int j=0,p=0;
            for (int i = 0; i <n ; i++) {
                Integer x=set.floor(jobs[i].deadline-1);

                if(x!=null){
                    j++;
                    p+=jobs[i].profit;
                    set.remove(x);
                }
            }
            System.out.println(j+" "+p);
        }
    }

    private static int max(job[] jobs, int n) {
        int max = jobs[0].deadline;
        for (int i = 1; i < n; i++) {
            job job = jobs[i];
            if (max < job.deadline) {
                max = job.deadline;
            }
        }
        return max;
    }
}
