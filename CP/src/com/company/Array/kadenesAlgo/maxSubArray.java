package com.company.Array.kadenesAlgo;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class maxSubArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Vector<Long> vector=new Vector<>();
        for (int i = 0; i <n ; i++) {
            vector.add(s.nextLong());
        }
        long x= Collections.max(vector);
        if (x<0)
            System.out.println(x);
        else {
            long sum=0,max=0;
            for (int i = 0; i <vector.size() ; i++) {
                sum+=vector.get(i);
                if (sum<0)
                    sum=0;
                else if(sum>max){
                    max=sum;
                }
            }
            System.out.println(max);
        }
    }
}
