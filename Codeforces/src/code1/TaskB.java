package code1;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),k=in.nextInt();
            int N=n*k;
            long[] a=new long[N+1];
            for (int i = 1; i <=N ; i++) {
                a[i]=in.nextLong();
            }
            long ans=0;
            int i= (int) (N-n+Math.ceil(n/2.0));
            while (k>0){
                ans+=a[i];
                i= (int) (i-(n)+Math.ceil(n/2.0)-1);
                k--;
            }
            out.println(ans);
        }
    }
}
