package codeforces17Dec2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long a=in.nextLong(),b=in.nextLong(),c=in.nextLong();
            long res=(a+b+c);
            if(res%9==0){
                res=res/9;
                long min=Math.min(a,Math.min(b,c));
                if(min>=res)
                    out.println("YES");
                else
                    out.println("NO");

            }else {
                out.println("NO");
            }
        }
    }
}
