package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.LinkedList;
import java.util.Queue;

public class JizzuAndChildren {


    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(), m = in.nextInt();
        int large=0;
        int ans=0;
        double d=m;
        for (int i = 1; i <= n; i++) {
            int v = in.nextInt();
            int curr;
             curr= (int) Math.ceil(v/d);
            if (curr>=large){
                large=curr;
                ans=i;
            }
        }
        out.println(ans);
    }
}
