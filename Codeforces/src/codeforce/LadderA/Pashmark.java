package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Objects;

public class Pashmark {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int x1=in.nextInt(),y1=in.nextInt(),x2=in.nextInt(),y2=in.nextInt();
        if (x1!=x2&&y1!=y2&&Math.abs(x1-x2)!=Math.abs(y1-y2))
            out.println(-1);
        else if (x1==x2){
            out.println((x1+Math.abs(y1-y2))+" "+y1+" "+(x2+Math.abs(y1-y2))+" "+y2);
        }else if (y1==y2)
            out.println(x1+" "+(y1+Math.abs(x1-x2))+" "+x2+" "+(y2+Math.abs(x1-x2)));
        else
            out.println(x1+" "+y2+" "+x2+" "+y1);
    }
}
