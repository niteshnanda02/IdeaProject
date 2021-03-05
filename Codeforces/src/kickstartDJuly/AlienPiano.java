package kickstartDJuly;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class AlienPiano {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        for (int i = 1; i <=testNumber ; i++) {
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            int ans=0,c=0;

            for (int j = 1; j < n; j++) {
                    c++;
                if(c>4){
                    ans++;
                    c=0;
                }
            }


            out.println("Case #"+i+": "+ans);
        }
    }
}
