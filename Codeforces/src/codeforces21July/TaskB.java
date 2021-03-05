package codeforces21July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            boolean f=false,s=false;
            for (int i = 0; i <n ; i++) {
                if(i%2==0){
                    if(a[i]>1){
                        f=true;
                        break;
                    }
                }else {
                    if(a[i]>1){
                        s=true;
                        break;
                    }
                }
            }
            if (!f&&!s){
                if(n%2==0)
                    out.println("Second");
                else
                    out.println("First");
            }
            else if(f){
                out.println("First");
            }else if(s){
                out.println("Second");
            }
        }
    }
}
