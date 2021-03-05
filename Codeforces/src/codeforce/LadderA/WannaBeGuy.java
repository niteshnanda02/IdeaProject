package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WannaBeGuy {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        Set<Integer>set=new HashSet<>();
        for (int i = 1; i <=n ; i++) {
            set.add(i);
        }
        for (int i = 0; i <2 ; i++) {
            int p=in.nextInt();
            for (int j = 0; j <p; j++) {
                int v=in.nextInt();
                if (set.contains(v))
                    set.remove(v);
            }
        }
        if (set.size()==0)
            out.println("I become the guy.");
        else
            out.println("Oh, my keyboard!");

    }
}
