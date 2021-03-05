package kickstartDJuly;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class RecordBreaker {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        for (int l = 1; l <= testNumber; l++) {

            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            int max=Integer.MIN_VALUE,cnt=0;
            for (int i = 0; i <n ; i++) {
                if(max<a[i]){
                    if(i==n-1)
                        cnt++;
                    else if(a[i]>a[i+1])
                        cnt++;
                    max=a[i];
                }
            }

            out.println("Case #"+l+": "+cnt);
        }
    }
}
