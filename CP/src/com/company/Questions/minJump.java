package com.company.Questions;
import java.util.*;
public class minJump {
    static boolean[] visited;
    public static boolean canReach(int[] arr, int start) {
        List<List<String>> list=new ArrayList<>();
        Map<Integer,List<String>> map=new TreeMap<>(Collections.reverseOrder());
        return solve(arr,start);
    }

    private static boolean solve(int[] arr, int start) {
        if(start<0||start>= arr.length)
            return false;

        return arr[start]==0||solve(arr,start+arr[start])||solve(arr,start-arr[start]);

    }


    public static void main(String[] args) {
        System.out.println(canReach(new int[]{3,0,2,1,2},2));
    }
}
