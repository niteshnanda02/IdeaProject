package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Games {
    class Pair{
        int h,g;

        public Pair(int h, int g) {
            this.h = h;
            this.g = g;
        }
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        Pair[] p=new Pair[n];
        for (int i = 0; i <n ; i++) {
            p[i]=new Pair(in.nextInt(),in.nextInt());
        }
        int ans=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if (j!=i){
                    if (p[i].h==p[j].g)
                        ans++;
                }
            }
        }
        out.print(ans);
    }
}
