package codeforces30NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();
        while (t-->0){
            int X=in.nextInt();
            int ans=0;
            int j=0;
            while (ans<X){
                j++;
                ans+=j;
            }
            if (ans-X==1)
                out.println((j+1));
            else
                out.println(j);
        }
    }
}
