package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class YoungPhysics {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int x,y,z;
        int s1=0,s2=0,s3=0;
        for (int i = 0; i <n ; i++) {
            x=in.nextInt();
            y=in.nextInt();
            z=in.nextInt();
            s1+=x;
            s2+=y;
            s3+=z;
        }
        if (s1==0&&s2==0&&s3==0)
            out.println("YES");
        else
            out.println("NO");
    }
}
