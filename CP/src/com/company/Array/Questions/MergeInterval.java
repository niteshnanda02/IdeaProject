package com.company.Array.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeInterval {
    public static void main(String[] args) {
        int[][] a= {{1,4}, {4,5}};
        a=new Solutio().merge(a);
        for (int[] b:
            a ) {
            System.out.println(Arrays.toString(b));
        }
    }
}
class Solutio {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[]    t1) {
                return ints[0]-t1[0];
            }
        });
        Stack<int[]> stack=new Stack<>();
        for (int i = 0; i <intervals.length ; i++) {
            if(!stack.isEmpty()&&stack.peek()[1]>=intervals[i][0]){
                int[] elem=stack.pop();
                elem[1]=Math.max(elem[1],intervals[i][1]);
                stack.push(elem);
            }else {
                stack.push(intervals[i]);
            }
        }
        int[][] ans=new int[stack.size()][2];
        int i=stack.size()-1;
        while (!stack.isEmpty()){
            ans[i]=stack.pop();
            i--;
        }
        return ans;
    }
}