package com.company.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverLapping {
    public static void main(String[] args) {
        int[][] arr={{1,3},{8,10},{2,6},{15,18}};
        arr=new SolSecondApproach().merge(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i][0]+" "+arr[i][1]);
        }
    }
}

class SolutionFirstApproach {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]-t1[0];
            }
        });
        Stack<int[]> stack=new Stack<>();
        stack.push(intervals[0]);
        for (int i = 1; i <intervals.length ; i++) {
            int[] a=stack.peek();
            if(a[1]<intervals[i][0]){
                stack.push(intervals[i]);
            }else if(a[1]<intervals[i][1]){
                a[1]=intervals[i][1];
                stack.pop();
                stack.push(a);
            }
        }
        int[][] res=new int[stack.size()][2];
        for (int i = 0; i <stack.size() ; i++) {
            res[i][0]=stack.get(i)[0];
            res[i][1]=stack.get(i)[1];
        }
        return res;
    }
}
class SolSecondApproach{
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return t1[0]-ints[0];
            }
        });

        int index=0;
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[index][0]<=intervals[i][1]&&intervals[index][1]>=intervals[index][0]){
                intervals[index][0]=Math.min(intervals[index][0],intervals[i][0]);
                intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
            }else {
                intervals[++index]=intervals[i];
            }
        }
        int[][] res=new int[index+1][2];
        for (int i = 0; i <=index ; i++) {
            res[i][0]=intervals[i][0];
            res[i][1]=intervals[i][1];
        }
        return res;
    }
}