package DIV3JAN2021;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0) {
            int n=in.nextInt();
            long[] arr=in.nextLongArray(n);
            for (int i = n-1; i >=0 ; i--) {
                if(i+arr[i]<n){
                    arr[i]+=arr[(int) (i+arr[i])];
                }
            }
            long max=0;
            for (int i = 0; i <arr.length ; i++) {
                max=Math.max(arr[i],max);
            }
           out.println(max);
        }
    }
}
