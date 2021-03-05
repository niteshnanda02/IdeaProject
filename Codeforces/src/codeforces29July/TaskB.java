package codeforces29July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    long[][] dp=new long[100002][6];
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),k=in.nextInt(),z=in.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
            }
            for (long[] ar:dp
                 ) {
                Arrays.fill(ar,-1);
            }
            long ans=check(a,1,k,z,n)+a[0];
            out.println(ans);
        }
    }

    private long check(int[] a, int i, int k, int z, int n) {
        if(k==0||i<0||i>=n)
            return 0;
        if(dp[i][z]!=-1)
            return dp[i][z];
        long val=0;
        if(i<n){
            val=Math.max(val,a[i]+check(a,i+1,k-1,z,n));
        }
        if(i>=0&&z>0){
            val+=Math.max(val,a[i]+check(a,i-1,k-1,z-1,n));
        }
        return dp[i][z]=val;
    }
}
