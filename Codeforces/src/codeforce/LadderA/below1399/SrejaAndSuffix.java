package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class SrejaAndSuffix {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        int[] a=new int[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=in.nextInt();
        }
        int[] dp=new int[n+2];
        Set<Integer> set=new HashSet<>();
        for (int i = n; i >0 ; i--) {
            if (!set.contains(a[i])){
                dp[i]=dp[i+1]+1;
                set.add(a[i]);
            }else
                dp[i]=dp[i+1];
        }

        for (int i = 0; i <m ; i++) {
            int temp=in.nextInt();
            out.println(dp[temp]);
        }
    }

}
