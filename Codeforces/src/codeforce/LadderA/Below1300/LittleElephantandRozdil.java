package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class LittleElephantandRozdil {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        boolean flag=false;
        int min=Integer.MAX_VALUE;
        int index=1;
        for (int i = 1; i <=n ; i++) {
            int c=in.nextInt();
            if (c==min){
                flag=true;
            }
            if (c<min){
                min=c;
                index=i;
                flag=false;
            }

        }
        if (flag)
            out.println("Still Rozdil");
        else
            out.println(index);


    }
}
