package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class GameWithStick {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),m=in.nextInt();
        int ans=Math.min(n,m);
        if (ans%2==0){
            out.println("Malvika");
        }else {
            out.println("Akshat");
        }
    }
}
