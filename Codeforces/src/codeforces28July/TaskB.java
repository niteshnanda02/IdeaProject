package codeforces28July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            long temp=n;
            long c2=0,c3=0;
            while (temp%3==0){
                temp=temp/3;
                c3++;
            }
            while (temp%2==0){
                temp=temp/2;
                c2++;
            }
            if(c3<c2||temp!=1){
                out.println(-1);
            }else {
                out.println(c3+(c3-c2));
            }
        }
    }
}
