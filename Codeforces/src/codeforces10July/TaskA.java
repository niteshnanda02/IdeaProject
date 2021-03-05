package codeforces10July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long a=in.nextLong(),b=in.nextLong(),c=in.nextLong();
            if (a==b&&b==c){
                out.println("-1 "+ b);
            }else {
                long ares,bres;
                if(a>c) {
                    if (a * 2 > c) {
                        ares = -1;
                        bres = 2;
                    } else {
                        ares = 2;
                        bres = -1;
                    }
                }else {
                    ares=1;
                    if(a*2>c){
                        bres=2;
                    }else {
                        bres=-1;
                    }
                }
                out.println(ares+" "+bres);
            }
        }
    }
}
