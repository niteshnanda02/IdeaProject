package codeforces20DEC2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskC {
    static ArrayList<ArrayList<Integer>> adj;
    static int[] vis;

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            adj = new ArrayList<>(n + 1);
            for (int i = 0; i < n + 1; i++) {
                adj.add(new ArrayList<>());
            }
            vis = new int[n + 1];
            int m = in.nextInt();
            int same = 0;
            int temp = m;
            while (temp-- > 0) {
                int a = in.nextInt(), b = in.nextInt();
                if (a == b)
                    same++;
                else
                    adj.get(a).add(b);

            }
            int cycle = 0;
            for (int i = 1; i < n + 1; i++) {
                if(vis[i]==1)
                    continue;

                vis[i]=1;
                for (int child:adj.get(i)
                     ) {
                    cycle+=cycle(child,i);
                }
            }
            out.println((m - same + cycle));
        }
    }

    private int cycle(int node, int par) {
        if (node==par)
            return 1;
        if (vis[node]==1)
            return 0;
        for (int child:adj.get(node)
             ) {
            return cycle(child,par);
        }
        return 0;
    }
}
