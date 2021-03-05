package codeforces17July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();

            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <2*n ; i++) {
                int val=in.nextInt();
                if (!list.contains(val))
                list.add(val);
            }
            for (Integer i:list             ) {
                out.print(i+" ");
            }
            out.println();
        }
    }
}
