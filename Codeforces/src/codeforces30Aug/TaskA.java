package codeforces30Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int[] c=new int[27];
            int n=in.nextInt();
            for (int i = 0; i <n ; i++) {
                String s=in.nextString();
                for (int j = 0; j <s.length() ; j++) {
                    c[s.charAt(j)-'a']++;
                }
            }
            boolean temp=true;
            for (int i = 0; i <27 ; i++) {
                if(c[i]>0){
                    if(c[i]%n!=0){
                        temp=false;
                        break;
                    }
                }
            }
            if (temp)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
