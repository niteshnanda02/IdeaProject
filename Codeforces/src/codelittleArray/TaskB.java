package codelittleArray;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextIntArray(n);
        Arrays.sort(a);
        int c=0;
        for (int i = 1; i <n ; i+=2) {
            c+=a[i]-a[i-1];
        }
        out.println(c);
    }
}
