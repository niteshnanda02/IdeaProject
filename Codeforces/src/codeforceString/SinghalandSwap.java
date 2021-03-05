package codeforceString;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class SinghalandSwap {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            String t=in.nextString();
            char[] S=s.toCharArray();
            char[] T=t.toCharArray();
            Arrays.sort(S);
            Arrays.sort(T);
            for (int i = S.length-1,j=0; i >=0&&j<T.length ; i--,j++) {
                if (S[i]>T[j]){
                    S[i]=T[j];
                }else
                    break;

            }
            Arrays.sort(S);
            for (int i = 0; i <S.length ; i++) {
                out.print(S[i]);
            }
            out.println();
        }
    }
}
