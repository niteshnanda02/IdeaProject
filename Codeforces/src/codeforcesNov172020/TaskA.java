package codeforcesNov172020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t=in.nextInt();
        while (t-->0){
            int n=in.nextInt(),c0=in.nextInt(),c1=in.nextInt(),h=in.nextInt();
            String s=in.nextString();
            int z=0,o=0;
            for (int i = 0; i <n ; i++) {
                if(s.charAt(i)=='0'){
                    z++;
                }else
                    o++;
            }
            long ans=0;
            if(c1==c0){
                ans=(z*c0)+(o*c1);
            }else if(c1>c0){
                ans=(z*c0)+(o*c0)+(h*o);
            }else {
                ans=(o*c1)+(z*c1)+(h*z);
            }
            out.println(ans);
        }
    }
}
