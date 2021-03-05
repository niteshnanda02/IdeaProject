package code1;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt(), c0 = in.nextInt(), c1 = in.nextInt(), h = in.nextInt();
            String s = in.nextString();
            int z = 0, o = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    z++;
                } else
                    o++;
            }
            int ans = 0;
            int t1=0,t2=0,t3=0;
            t1+=n*c0+h*o;
            t2+=n*c1+h*z;
            t3+=c0*z+c1*o;
            ans=Math.min(t1,Math.min(t2,t3));
            out.println(ans);
        }
    }
}
