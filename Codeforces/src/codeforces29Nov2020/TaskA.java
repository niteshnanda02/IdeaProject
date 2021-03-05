package codeforces29Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong(),m=in.nextLong(),r=in.nextLong(),c=in.nextLong();
            long max=0;
            long cal=Math.abs(r-1)+Math.abs(c-1);
            max=Math.max(max,cal);
            cal=Math.abs(r-1)+Math.abs(c-m);
            max=Math.max(max,cal);
            cal=Math.abs(r-n)+Math.abs(c-1);
            max=Math.max(max,cal);
            cal=Math.abs(r-n)+Math.abs(c-m);
            max=Math.max(max,cal);
            out.println(max);
        }
    }
}
