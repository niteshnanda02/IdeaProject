package codeforces4Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),x=in.nextInt(),y=in.nextInt();
            int[] bestA=null;
            int best=Integer.MAX_VALUE;
            for (int start = 1; start <=50 ; start++) {
                for (int diff = 1; diff <=50 ; diff++) {
                    int[] a=gen(n,start,diff);
                    boolean hasX=false,hasY=false;
                    for (int i:a
                         ) {
                        if (i==x) hasX=true;
                        if (i==y) hasY=true;
                    }

                    if (hasX&&hasY&&a[n-1]<best){
                        best=a[n-1];
                        bestA=a;
                    }
                }
            }
            for (int a:bestA
                 ) {
                out.print(a+" ");
            }
            out.println();
        }
    }

    private int[] gen(int n, int start, int diff) {
        int[] a=new int[n];
        a[0]=start;

        for (int i = 1; i <n ; i++) {
            a[i]=a[i-1]+diff;

        }
        return a;
    }
}
