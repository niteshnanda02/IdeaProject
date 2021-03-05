package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class HelpfulMaths {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s=in.next();
        s=s.replaceAll("[+]","");
        if (s.length()==1){
            out.println(s);
        }else {
            char[] a=s.toCharArray();
            Arrays.sort(a);
            for (int i = 0; i <a.length ; i++) {
                out.print(a[i]);
                if (i<a.length-1)
                    out.print("+");
            }
        }
    }
}
