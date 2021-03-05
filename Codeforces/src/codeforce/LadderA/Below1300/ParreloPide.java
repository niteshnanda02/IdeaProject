package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ParreloPide {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int i=in.nextInt(),j=in.nextInt(),k=in.nextInt();
        int a=0,b=0,c=0;
        b= (int) Math.sqrt((i*j)/k);
        a=i/b;
        c=k/a;
        int ans=(a+b+c)*4;
        out.println(ans);
    }
}
