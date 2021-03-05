package codeforces30July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int f=6,s=10,t=14,d=n-30;

            if(d<=0){
                out.println("NO");
            }else if(d==f){
                out.println("YES");
                out.println(5+" "+6+" "+10+" "+15);
            }else if(d==s){
                out.println("YES");
                out.println(f+" "+15+" "+t+" "+(d-5));
            }else if(d==t){
                out.println("YES");
                out.println(f+" "+s+" "+(t+1)+" "+(d-1));
            }
            else {
                out.println("YES");
                out.println(f+" "+s+" "+t+" "+d);
            }

        }
    }
}
