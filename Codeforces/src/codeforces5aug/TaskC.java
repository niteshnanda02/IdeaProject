package codeforces5aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int n = in.nextInt();
            int[] cnt=new int[n+1];
            for (int i = 0; i <n ; i++) {
                int v=in.nextInt();
                ++cnt[v];
            }
            int ans=0;
            for (int s = 2; s <=2*n ; s++) {
                int curr=0;
                for (int i = 1; i <(s+1)/2 ; i++) {
                    if(s-i>n)
                        continue;
                        curr+=Math.min(cnt[i],cnt[s-i]);
                }
                if(s%2==0)
                    curr+=(cnt[s/2]/2);
                ans=Math.max(ans,curr);
            }
            out.println(ans);

        }
    }
}
