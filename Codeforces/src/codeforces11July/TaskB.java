package codeforces11July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            long n = in.nextLong();

            if(n%2==0){
                out.println(n/2+" "+n/2);
            }else {

                long res=-1;
                for (long i = 2; i*i <=n ; i++) {
                    if(n%i==0){
                        res=n/i;
                        break;
                    }
                }
                if (res==-1){
                    n--;
                    out.println(1+" "+n);
                }else {
                    out.println(Math.min(res,n-res)+" "+Math.max(res,n-res));
                }
            }

        }
    }
}
