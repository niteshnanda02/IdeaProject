package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class DimaAndStairCase {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        long[] a=new long[n+1];
        for (int i = 1; i <=n ; i++) {
            a[i]=in.nextLong();
        }
        int m=in.nextInt();
        long maxHeight=0;
        for (int i = 0; i <m ; i++) {
            int w=in.nextInt();long h=in.nextLong();
            long cheight=a[w];
            maxHeight=Math.max(cheight,maxHeight);
            out.println(maxHeight);
            maxHeight+=h;
        }
    }
}
