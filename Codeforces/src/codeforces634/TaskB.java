package codeforces634;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),a=in.nextInt(),b=in.nextInt();
            if(a==b||a>26){
                for (int i = 0; i <n ; i++) {
                    out.print((char)((i%26)+'a'));
                }
            }else {
                String f="",s="",t="";
                int i=0;
                for ( i = 0; i <b ; i++) {
                    f+=(char)(i+'a');
                }
                for (int j = 0; j <a-b ; j++) {
                    s+=(char)(i-1+'a');
                }
                String res=f+s+f;
                if(res.length()>n){
                    out.print(res.substring(0,n));
                }else {
                    for (int j = 0; j < n; j += res.length()) {
                        out.print(res);
                    }
                    int v = n % res.length();
                    out.print(res.substring(0, v));
                }
            }

            out.println();
        }
    }
}
