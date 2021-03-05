package codeforces24july;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.Vector;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            char[] c=new char[51];
            Arrays.fill(c,'a');
            print(c,out);
            for (int i = 0; i <n ; i++) {
                c[a[i]]=(c[a[i]]=='a')?'b':'a';
                print(c,out);
            }

        }
    }
    private void print(char[] a,OutputWriter out){
        for (int i = 0; i <a.length ; i++) {
            out.print(a[i]);
        }
        out.println();
    }
}
