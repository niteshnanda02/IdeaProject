package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class EvenOd {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n=in.nextLong(),k=in.nextLong();
        double mid=Math.ceil(n/2.0);
        long ans=0;
        if (k>mid){
            k-=mid;
            ans=2+(2*(k-1));

        }else {
            ans=1+(2*(k-1));
        }
        out.println(ans);

    }
}
