package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ThenumberOfPosition {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),a=in.nextInt(),b=in.nextInt();
        int diff=n-a;

        if (b>diff){
            int v=b-diff;
            diff-=v;
        }
        out.println(diff);
    }
}
