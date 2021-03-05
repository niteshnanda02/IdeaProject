package codeforce16June;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            if (s.length()<3){
                out.println(s);
            }else {
                int c=2;
                for (int i = 0; i <s.length() ; i++) {
                    if (i==c){
                        c+=2;
                        continue;
                    }
                    out.print(s.charAt(i));
                }
                out.println();
            }
        }
    }
}
