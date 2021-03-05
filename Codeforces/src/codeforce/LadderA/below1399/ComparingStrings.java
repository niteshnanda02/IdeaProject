package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;

public class ComparingStrings {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        String s1 = in.nextString();
        String s2 = in.nextString();
        if (s1.length() !=s2.length())
            out.println("NO");
        else {
            char[] S1 = s1.toCharArray();
            char[] S2 = s2.toCharArray();
            int c=0;
            for (int i = 0; i < Math.min(S1.length, S2.length); i++) {
                if (S1[i] != S2[i]) {
                    c++;
                }
            }
            if (c<=2)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
