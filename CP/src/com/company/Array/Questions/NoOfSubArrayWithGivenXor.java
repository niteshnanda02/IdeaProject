package com.company.Array.Questions;

import java.util.HashMap;

public class NoOfSubArrayWithGivenXor {
    static int subArray(int[] arr,int m){
        //y^k=XR
        //therefore y=XR^k
        HashMap<Integer,Integer> freqmap=new HashMap<>();
        int cnt=0,xor=0;

        for(int elem:arr){
            xor^=elem;
            //count all y sub array
            if(freqmap.containsKey(xor^m))
                cnt+=freqmap.get(xor^m);

            if(xor==m)
                cnt++;

            freqmap.put(xor,freqmap.getOrDefault(xor,0)+1);
        }

        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(subArray(new int[]{5, 6, 7, 8, 9}, 5));
    }
}
