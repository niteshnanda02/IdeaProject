package Codeforces23Jun;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            if (n%4==0)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
