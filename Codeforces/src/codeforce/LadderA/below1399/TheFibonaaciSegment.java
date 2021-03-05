package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TheFibonaaciSegment {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        long[] a=in.nextLongArray(n);
        long max=2;
        if (n==1)
            max=1;
        int l=0;
        for (int i = 2; i <n ; i++) {
            if (a[i]==a[i-1]+a[i-2]){
                max=Math.max(max,i+1-l);
            }else {
                l=i-1;
            }
        }
        out.println(max);
    }
}
