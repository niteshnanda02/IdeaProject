package codeforce28May;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),m=in.nextInt(),k=in.nextInt();
            if(m==0){
                out.println(0);
            }else {
                int ans=n/k;
                if(ans>=m){
                    out.println(m);
                }else {
                    m-=ans;
                    k--;
                    int v=m%k==0?m/k:m/k+1;
                    if (v==ans)
                        out.println(0);
                    else
                        out.println(ans-v);
                }
            }
        }
    }
}
