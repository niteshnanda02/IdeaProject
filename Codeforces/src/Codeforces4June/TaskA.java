package Codeforces4June;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long a = in.nextLong(), b = in.nextLong();

            if (a == b)
                out.println(0);
            else if (a > b ? a % b != 0 : b % a != 0)
                out.println(-1);
            else {
                long div=a>b?a/b:b/a;
                if (Long.bitCount(div)!=1){
                    out.println(-1);
                    continue;
                }

                long ans=0;
                while (div>1){
                    div/=2;
                    ans++;
                }
                long res=ans/3;
                if (ans%3!=0){
                    res++;
                }
                out.println(res);
            }
        }
    }

}
