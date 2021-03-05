package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class FreeCash {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        long[] ar=new long[24*60+100000];
        long ans=0;
        while (testNumber-- > 0) {
            int h = in.nextInt(), m = in.nextInt();
            int min = (h * 60) + m;
            ar[min]++;
            ans=Math.max(ans,ar[min]);
        }
        out.println(ans);
    }
}
