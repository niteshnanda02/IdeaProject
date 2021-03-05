package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class Puzzles {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        int[] a=in.nextSortedIntArray(m);
        int best=Integer.MAX_VALUE;
        for (int i = 0; i <=m-n ; i++) {
            best=Math.min(best,a[i+n-1]-a[i]);
        }
        out.println(best);
    }
}
