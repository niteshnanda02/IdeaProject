package codeforces634;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Task {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            if(n%2==0){
                n/=2;
                if(n>0)
                    n--;
            }else {
                n--;
                n/=2;

            }
            out.println(n);
        }
    }
}
