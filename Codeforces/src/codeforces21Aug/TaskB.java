package codeforces21Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long c = 0;
            long x1 = in.nextLong(), y1 = in.nextLong(), z1 = in.nextLong();
            long x2 = in.nextLong(), y2 = in.nextLong(), z2 = in.nextLong();

            long m1 = Math.max( z1, y2) * 2;
            long m2=Math.min(y1,z2)*2;
            c=m1-m2;
            out.println(c);
        }
    }
}
