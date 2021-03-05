package com.company.Questions;

import java.math.BigInteger;

public class SmallestIntegerDivisiblebyK {
    public static int smallestRepunitDivByK(int K) {
        String s="";
        BigInteger k=BigInteger.valueOf(K);
        BigInteger n;
        for(int i=1;i<=K;i++){
            s+="1";
            n=new BigInteger(s);
            BigInteger ans=n.mod(k);
            if (ans.intValue()==0)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(smallestRepunitDivByK(20));
    }
}
