package com.company.Questions;

import java.text.DecimalFormat;
import java.util.*;

public class rSamDilemma {
    public static void main(String[] args) {
        String p="#0.000000";
        DecimalFormat df=new DecimalFormat(p);
        System.out.println(df.format(345.4));
        String s=String.format("%.6f",345.4);
        System.out.println(s);
        HashMap<Character,Integer> map=new HashMap<>();
        Set<Map.Entry<Character,Integer>> entries=map.entrySet();
        for (Map.Entry<Character,Integer> entry:entries
             ) {
            if (entry.getValue()%2==0){

            }
        }
        int[] input1={1,2},input3={3},input5={2,3};
        System.out.println(compute(input1,2,input3,1,input5,2));

    }

    private static int compute(int[] input1, int input2, int[] input3, int input4, int[] input5, int input6) {
        int ans=0;
        for (int i = 0; i <input2 ; i++) {
            for (int j = 0; j <input4 ; j++) {
                for (int k = 0; k <input6 ; k++) {
                    int xor=input1[i]^input3[j]^input5[k];
                    int val=Integer.bitCount(xor);
                    if (val%2==0)
                        ans++;
                }
            }
        }
        return ans;
    }
}
