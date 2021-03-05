package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class DubStep {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        s=s.replaceAll("WUB"," ");
        out.println((s.charAt(0)==' ')?s.substring(1):s);
    }
}
