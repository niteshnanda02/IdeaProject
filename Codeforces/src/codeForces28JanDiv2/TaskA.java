package codeForces28JanDiv2;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            int max=1;
            int temp=1;
            for (int i = 1; i <n ; i++) {
                if(a[i-1]==a[i])
                    temp++;
                else{
                    temp=1;
                }
                max=Math.max(temp,max);
            }
            out.println(max);
        }
    }
}
