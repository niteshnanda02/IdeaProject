package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class CheapTravel {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt(), m = in.nextInt(), a = in.nextInt(), b = in.nextInt();
        int v1=n*a;
        int v2=(n/m)*b;
        int rem=n%m;
        if (rem!=0){
            int c1=b;
            int c2=rem*a;
            int v=Math.min(c1,c2);
            v2+=v;
        }

        out.println(Math.min(v1,v2));
    }
}
