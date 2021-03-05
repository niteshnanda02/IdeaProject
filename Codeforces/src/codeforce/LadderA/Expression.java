package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Expression {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int i=in.nextInt(),j=in.nextInt(),k=in.nextInt();
        int ans=0;
        ans=Math.max(ans,i+(j*k));
        ans=Math.max(ans,i*(j+k));
        ans=Math.max(ans,i*j*k);
        ans=Math.max(ans,(i+j)*k);
        ans=Math.max(ans,i+j+k);
        out.println(ans);
    }
}
