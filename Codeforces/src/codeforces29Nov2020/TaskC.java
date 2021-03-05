package codeforces29Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(), p=in.nextInt(), k=in.nextInt();
            String s=in.nextString();
            int x=in.nextInt(), y=in.nextInt();
            long min=Integer.MAX_VALUE;
            p--;
            for (int i = p; i <=p+k+1&&i<n ; i++) {
                int curr=(i-p)*y;
                for (int j = i; j <n ; j+=k) {
                    char ch=s.charAt(j);
                    if(ch=='0'){
                        curr+=x;
                    }

                }
                min=Math.min(curr,min);

            }
            out.println(min);
        }
    }
}
