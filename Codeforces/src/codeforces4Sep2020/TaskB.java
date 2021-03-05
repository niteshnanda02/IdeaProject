package codeforces4Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long a = in.nextLong(), b = in.nextLong(), x = in.nextLong(), y = in.nextLong(), n = in.nextLong();
            long ans = a * b;
            long ta=a,tb=b;
            if (ta-n>=x){
                ta=a-n;
                ans=Math.min(ans,(ta*tb));
            }else {
                long t=n-(ta-x);
                ta=ta-(n-t);
                if(tb-t>=y){
                    tb=tb-t;
                }else {
                    tb=y;
                }
                ans=Math.min(ans,(ta*tb));
            }
            ta=a;tb=b;
            if (tb-n>=y){
                tb=b-n;
                ans=Math.min(ans,(ta*tb));
            }else {
                long t=n-(tb-y);
                tb=tb-(n-t);
                if(ta-t>=x){
                    ta=ta-t;
                }else {
                    ta=x;
                }
                ans=Math.min(ans,(ta*tb));
            }

            out.println(ans);
        }
    }
}
