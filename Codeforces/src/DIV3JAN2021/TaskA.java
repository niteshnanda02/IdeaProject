package DIV3JAN2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-- > 0) {
            int weight=in.nextInt(),height=in.nextInt();
            long n=in.nextLong();
            long count=1;
            while (weight>0){
                if(weight%2==0){
                    weight/=2;
                    count*=2;
                }else
                    break;
            }

            while (height>0){
                if(height%2==0){
                    height/=2;
                    count*=2;
                }else
                    break;
            }
            if(count>=n){
                out.println("YES");
            }else {
                out.println("NO");
            }

        }
    }
}
