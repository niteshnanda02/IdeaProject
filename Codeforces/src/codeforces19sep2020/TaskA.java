package codeforces19sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int n = in.nextInt();
            String num = in.nextString();
            int res;
            if(n%2==0){
                res=1;
                for (int i = 1; i <n ; i+=2) {
                    int v=num.charAt(i)-'0';
                    if(v%2==0){
                        res=2;
                        break;
                    }
                }

            }else {
                res=2;
                for (int i = 0; i <n ; i++) {
                    int v=num.charAt(i)-'0';
                    if(v%2!=0){
                        res=1;
                        break;
                    }
                }
            }
            out.println(res);
        }
    }
}
