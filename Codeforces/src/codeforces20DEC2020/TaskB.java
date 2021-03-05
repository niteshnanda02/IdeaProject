package codeforces20DEC2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            while (!solve(n))
                n++;
            out.println(n);
        }
    }

    private boolean solve(long n) {
        long k=n;
        while (k>0){
            long num=k%10;
            if(num!=0&&n%num!=0)
                return false;
            k=k/10;

        }
        return true;
    }
}
