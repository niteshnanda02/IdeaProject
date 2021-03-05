package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class ChoosingTeam {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int k=in.nextInt();
        int c=0;
        int ans=0;

        for (int i = 0; i <n ; i++) {
            int v=in.nextInt();
            v+=k;
            if (v<=5)
                c++;
            if (c==3){
                ans++;
                c=0;
            }
        }
        out.println(ans);
    }
}
