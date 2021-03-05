package com.company.DP.MCM;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class evaluatExpressionToTrue {
    static Map<String, Integer> map=new HashMap<>();
    static int[][][] dp=new int[1002][1002][2];
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            map.clear();
            int n=s.nextInt();
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    for (int k = 0; k <2 ; k++) {
                        dp[i][j][k]=-1;
                    }
                }
            }
            String s1=s.next();
//            System.out.println(solveMemoUsingMap(s1,0,n-1,true));
            System.out.println(solveMemoUsingArray(s1,0,n-1,true));
        }
    }

    private static int solveMemoUsingMap(String s, int i, int j, boolean isTrue) {

        if (i>j)
            return 0;

        if (i==j){
            if (isTrue){
                return s.charAt(i)=='T'?1:0;
            }else
                return s.charAt(i)=='F'?1:0;
        }
        String temp=i+" "+j+" "+isTrue;
        if (map.containsKey(temp))
            return map.get(temp);
        int ans=0;
        for (int k = i+1; k <=j-1 ; k++) {


            int lt= solveMemoUsingMap(s,i,k-1,true);
            int lf= solveMemoUsingMap(s,i,k-1,false);
            int rt= solveMemoUsingMap(s,k+1,j,true);
            int rf= solveMemoUsingMap(s,k+1,j,false);

            if (s.charAt(k)=='&'){
                if (isTrue){
                    ans+=lt*rt;
                }else {
                    ans+=lf*rt+lt*rf+lf*rf;
                }
            }else if(s.charAt(k)=='|'){
                if (isTrue){
                    ans+=lf*rt+lt*rf+lt*rt;
                }else {
                    ans+=lf*rf;
                }
            }else {
                if (isTrue){
                    ans+=lf*rt+lt*rf;
                }else {
                    ans+=lf*rf+lt*rt;
                }
            }
        }
        int val=ans%1003;
        map.put(temp,val);
        return val;
    }

    private static int solveMemoUsingArray(String s, int i, int j, boolean isTrue) {
        int index=isTrue?1:0;
        if (i>j)
            return 0;

        if (i==j){
            if (isTrue){
                return dp[i][j][index]=s.charAt(i)=='T'?1:0;
            }else
                return dp[i][j][index]=s.charAt(i)=='F'?1:0;
        }
        if (dp[i][j][index]!=-1)
            return dp[i][j][index];
        int ans=0;
        for (int k = i+1; k <=j-1 ; k++) {


            int lt= solveMemoUsingMap(s,i,k-1,true);
            int lf= solveMemoUsingMap(s,i,k-1,false);
            int rt= solveMemoUsingMap(s,k+1,j,true);
            int rf= solveMemoUsingMap(s,k+1,j,false);

            if (s.charAt(k)=='&'){
                if (isTrue){
                    ans+=lt*rt;
                }else {
                    ans+=lf*rt+lt*rf+lf*rf;
                }
            }else if(s.charAt(k)=='|'){
                if (isTrue){
                    ans+=lf*rt+lt*rf+lt*rt;
                }else {
                    ans+=lf*rf;
                }
            }else {
                if (isTrue){
                    ans+=lf*rt+lt*rf;
                }else {
                    ans+=lf*rf+lt*rt;
                }
            }
        }
        return dp[i][j][index]=ans%1003;
    }
}
