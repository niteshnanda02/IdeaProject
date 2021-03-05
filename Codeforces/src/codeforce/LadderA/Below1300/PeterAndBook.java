package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class PeterAndBook {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=new int[8];
        for (int i = 1; i <=7 ; i++) {
            a[i]=in.nextInt();
        }
        int i=1;
        while (n>0){
            n-=a[i];
            if (n<=0)
                break;
            i++;
            if (i==8)
                i=1;
        }
        out.println(i);
    }
}
