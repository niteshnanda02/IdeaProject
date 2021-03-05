package codeforce11jul;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),x=in.nextInt(),m=in.nextInt();
            int L=x,R=x;
            int index=1;
            for (int i = 0; i <m ; i++) {
                int l=in.nextInt(),r=in.nextInt();
                if (l<L&&R<r){
                    L=l;
                    R=r;
                    index+=Math.abs(L-R);
                }else if(l<L&&L<=r){

                    index+=Math.abs(l-L);
                    L=l;
                }else if(r>R&&R>=l){

                    index+=Math.abs(r-R);
                    R=r;
                }
            }

            out.println(index);
        }
    }
}
