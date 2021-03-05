package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class EffectiveApproach {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=new int[n];
        int[] start=new int[(int) (Math.pow(10,5)+4)];
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextInt();
                start[a[i]]=i+1;
        }
        int m=in.nextInt();
        long vas=0,pet=0;
        for (int i = 0; i <m ; i++) {
            int b=in.nextInt();
            int ind=start[b];

            vas+=ind;
            pet+=n-ind+1;
        }
        out.println(vas+" "+pet);
    }

}
