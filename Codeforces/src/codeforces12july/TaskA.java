package codeforces12july;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int n = in.nextInt();
            int[] a = in.nextIntArray(n);
            boolean f=false;
            for (int i = 2; i <n ; i++) {
                if(a[i-2]<a[i-1]&&a[i-1]>a[i]){
                    f=true;
                    out.println("YES");
                    out.println((i-2+1)+" "+(i-1+1)+" "+(i+1));
                    break;
                }

            }
            if(!f)
                out.println("NO");

        }
    }
}
