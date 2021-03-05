package codeforces11July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=new int[n+1];
            int c=0;
            boolean f=false;
            for (int i = 1; i <=n; i++) {
                a[i]=in.nextInt();
                if(a[i]!=i)
                    c++;
            }
            if (c==0)
                out.println(0);
            else if (c==n)
                out.println(1);
            else
                out.println(2);
        }
    }
}
