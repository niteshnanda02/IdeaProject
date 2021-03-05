package codeforces15Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskD {
    static int[][] dp=new int[5002][5002];
    static StringBuilder builder=new StringBuilder();

    public void solve(int testNumber, InputReader in, OutputWriter out) {
            for (int[] a:dp
                 ) {
                Arrays.fill(a,-1);
            }
            int n=in.nextInt(),m=in.nextInt();
            builder=new StringBuilder();
            String a=in.nextString(),b=in.nextString();
            int lcs=lcs(a,b,n,m);
            a=convert(a,builder.toString());
            b=convert(b,builder.toString());
            long cal=(4*lcs)-a.length()-b.length();
            out.println(cal);
    }

    private String convert(String a, String b) {
        int i=0,j=0;
        while (i<a.length()&&j<b.length()){
            if(a.charAt(i)==b.charAt(j)){
                break;
            }
            i++;
        }
        a=a.substring(i,a.length());
        i=a.length()-1;j=b.length()-1;
        while (i>=0&&j>=0){
            if(a.charAt(i)==b.charAt(j))
                break;
            i--;
        }
        a=a.substring(0,i);
        return a;
    }

    private static void printlcs(String s1, String s2, int n, int m) {
        int i=n,j=m;
        while (i>0&&j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)) {
                builder.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else {
                if(dp[i][j-1]>=dp[i-1][j]){
                    j--;
                }else {
                    i--;
                }
            }
        }
        System.out.println(builder.reverse());
    }

    private static int lcs(String s1, String s2, int n, int m) {

        if(n==0||m==0)
            return 0;
        if(dp[n][m]!=-1)
            return dp[n][m];
        if(s1.charAt(n-1)==s2.charAt(m-1)){
            return dp[n][m]=1+lcs(s1,s2,n-1,m-1);
        }else {
            return dp[n][m]=Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
        }
    }
}
