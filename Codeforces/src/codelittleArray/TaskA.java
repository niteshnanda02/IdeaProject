package codelittleArray;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextIntArray(n);
        if(n==2)
            out.println(0);
        else {
            Arrays.sort(a);
            int f=a[n-1]-a[1];
            int s=a[n-2]-a[0];
            out.println(Math.min(f,s));
        }
    }
}
