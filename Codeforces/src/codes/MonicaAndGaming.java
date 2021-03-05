package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class MonicaAndGaming {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        long n=in.nextLong();
        long c=0;
        n--;
        while (n!=0){
            n=n>>1;
            c++;
        }
        out.println(c);
    }
}
