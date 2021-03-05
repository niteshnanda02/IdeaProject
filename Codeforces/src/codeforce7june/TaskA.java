package codeforce7june;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), m = in.nextInt();
            int[][] a = new int[n][m];
            Set<Integer> r=new HashSet<>();
            Set<Integer> c=new HashSet<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = in.nextInt();
                    if (a[i][j]==1){
                        r.add(i);
                        c.add(j);
                    }
                }
            }
            int min=Math.min(n-r.size(),m-c.size());
            if (min%2!=0)
                out.println("Ashish");
            else
                out.println("Vivek");
        }
    }


}