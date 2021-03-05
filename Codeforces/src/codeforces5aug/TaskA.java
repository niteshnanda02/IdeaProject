package codeforces5aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            int[] a=new int[n];
            for (int i = 0; i <n ; i++) {
                a[i]=in.nextInt();
            }
            Arrays.sort(a);
            if(n==1){
                out.println("YES");
            }else {
                boolean flag=false;
                for (int i = 1; i <n ; i++) {
                    if(a[i]-a[i-1]>1){
                        flag=true;
                        break;
                    }
                }
                if (flag)
                    out.println("NO");
                else
                    out.println("YES");
            }
        }
    }
}
