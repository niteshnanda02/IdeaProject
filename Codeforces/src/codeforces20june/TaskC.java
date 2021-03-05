package codeforces20june;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            long c=0;
            while (n>1){
                long f=factor(n);
                if (f==1){
                    n--;
                }else {
                    n/=f;
                }
                c++;
            }
            if (c%2!=0)
                out.println("Ashishgup");
            else
                out.println("FastestFinger");

        }
    }
    private long factor(long n) {
        long odd = 0;
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 != 0)
                    odd = Math.max(odd, i);
                if (i != n / i) {
                    if ((n / i) % 2 != 0)
                        odd = Math.max(odd, n / i);
                }
            }
        }
        return odd;
    }
}
