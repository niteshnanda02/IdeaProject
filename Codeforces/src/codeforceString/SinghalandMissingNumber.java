package codeforceString;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class SinghalandMissingNumber {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            if (s.length()==1)
                out.println(0);
            else {
                boolean flag=true;
                long curr=Integer.parseInt(String.valueOf(s.charAt(0)));
                for (int i = 1; i <s.length() ; i++) {
                    long val=Integer.parseInt(String.valueOf(s.charAt(i)));
                    if (flag){
                    }
                }
            }
        }
    }
}
