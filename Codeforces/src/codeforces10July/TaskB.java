package codeforces10July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            char[] a=s.toCharArray();
            Arrays.sort(a);
            int c=0;
            for (int i = 0; i <a.length ; i++) {
                if (a[i]=='1')
                    break;
                c++;
            }
            int min=Math.min(c,a.length-c);
            if (min%2!=0)
                out.println("DA");
            else
                out.println("NET");
        }
    }
}
