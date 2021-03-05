package codeforces17Dec2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n = in.nextInt();
            long[] a=new long[n];
            long e=0,o=0;
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextLong();
                if(i%2==0)
                    e+=a[i];
                else
                    o+=a[i];
            }
            if(e>o){
                for (int i = 0; i <n ; i++) {
                    if(i%2!=0){
                        out.print(1+" ");
                    }else {
                        out.print(a[i]+" ");
                    }
                }
            }else {
                for (int i = 0; i <n ; i++) {
                    if(i%2!=0){
                        out.print(a[i]+" ");
                    }else {
                        out.print(1+" ");
                    }
                }
            }
            out.println();
        }
    }
}
