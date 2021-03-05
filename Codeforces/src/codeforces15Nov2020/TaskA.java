package codeforces15Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int n = in.nextInt();
            System.out.println(n);
            for (int i = 1; i <=n ; i++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
