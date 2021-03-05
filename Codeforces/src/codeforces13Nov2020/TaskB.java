package codeforces13Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            boolean flag=false;
            Set<Integer> set=new HashSet<>();
            for (int i = 0; i <n ; i++) {
                int v=in.nextInt();
                if(set.contains(v)) {
                    flag = true;
                }else {
                    set.add(v);
                }
            }
            if (flag)
                out.println("YES");
            else
                out.println("NO");
        }
    }
}
