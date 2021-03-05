package codeForces28JanDiv2;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int q = in.nextInt(), d = in.nextInt();
            long[] a = in.nextLongArray(q);
            int[] arr = new int[11];
            Arrays.fill(arr, Integer.MAX_VALUE);
            for (int i = 1; i < 10; i++) {
                int elem = d * i;
                if (arr[elem % 10] == Integer.MAX_VALUE)
                    arr[elem % 10] = elem;
            }
            for (int i = 0; i <q ; i++) {
                if(a[i]>=d*10)
                    out.println("YES");
                else{
                    int index= (int) (a[i]%10);
                    if(arr[index]<=a[i])
                        out.println("YES");
                    else
                        out.println("NO");
                }
            }
        }
    }
}
