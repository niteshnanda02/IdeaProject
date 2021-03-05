package codeforcesDiv316Feb;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long x=in.nextLong();
            if(x!=1&&cube(x)){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
    }

    private boolean cube(long x) {
        long temp= (long) Math.cbrt(x);
        for (long i = 1; i <=temp+1 ; i++) {
            long curr=i*i*i;
            long rem=x-curr;
            if(rem>0){
                long cbr= (long) Math.cbrt(rem);
                if(cbr!=0&&((cbr*cbr*cbr)==rem))
                    return true;
            }
        }
        return false;
    }
}
