package codeforce.LadderA.Below1300;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class DimaAndFriend {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int p=0;
        for (int i = 0; i <n ; i++) {
            p+=in.nextInt();
        }
        p=p%(n+1)-1;
        int ans=0;
        for (int i = 1; i <=5 ; i++) {
            if ((p+i)%(n+1)!=0)
                ans++;
        }
        out.println(ans);
    }
}
