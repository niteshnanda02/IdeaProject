package kickstart23Aug2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class LongestArithmetic {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        for (int i = 1; i <=testNumber ; i++) {
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            long max_diff=a[1]-a[0];
            long c=1;
            long max=1;

            for (int j = 2; j <n ; j++) {
                long diff=a[j]-a[j-1];
                if (diff!=max_diff){
                    c=1;
                    max_diff=diff;
                }else {
                    c++;
                    max=Math.max(max,c);
                }
            }

            out.println("Case #"+i+": "+(max+1));
        }
    }
}
