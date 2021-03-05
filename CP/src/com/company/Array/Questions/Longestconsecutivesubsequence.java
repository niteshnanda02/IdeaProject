package com.company.Array.Questions;
import java.util.*;
public class Longestconsecutivesubsequence {
    static int findLongestConseqSubseq(int arr[], int N)
    {
        // add your code here
        Set<Integer> set=new HashSet<>();
        for(int elem:arr)
            set.add(elem);

        int max=1;

        for(int i=0;i<N;i++){
            if(!set.contains(arr[i]-1)){
                int num=arr[i];
                int curr=1;
                while(set.contains(num+1)){
                    curr++;
                    num=num+1;
                }
                max=Math.max(curr,max);
            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[] a={2,6,1,9,4,5,3};
        System.out.println(findLongestConseqSubseq(a,a.length));
        System.out.println(20%60);
        System.out.println(40%60);
    }
}
