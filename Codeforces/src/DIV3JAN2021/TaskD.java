package DIV3JAN2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            long[] arr = in.nextSortedLongArray(n);
            long a=0,b=0;
            boolean t=true;
            for (int i = n-1; i >=0 ; i--) {
                if (t){
                    t=false;
                    if(arr[i]%2==0)
                        a+=arr[i];
                }else{
                    t=true;
                    if(arr[i]%2!=0)
                        b+=arr[i];
                }
            }
            if(a>b){
                out.println("Alice");
            }else if(a<b){
                out.println("Bob");
            }else {
                out.println("Tie");
            }

        }
    }
}
