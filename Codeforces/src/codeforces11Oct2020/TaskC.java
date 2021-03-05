package codeforces11Oct2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            out.println("2");
            if(n==2){
                out.println("1 2");
            }else {
                out.println(n+" "+(n-2));
                out.println((n-1)+" "+(n-1));
                int val=n-1;
                for (int i = 2; i <n-1 ; i++) {
                    out.println(val+" "+(val-2));
                    val--;
                }
            }
        }
    }
}
