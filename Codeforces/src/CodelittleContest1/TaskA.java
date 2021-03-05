package CodelittleContest1;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextSortedIntArray(n);
        if (n<=2)
            out.println(0);
        else {
            int i = 0, j = n - 1;
            j--;
            int f=a[j]-a[i];
            i++;
            j=n-1;
            int s=a[j]-a[i];
            int d=Math.min(f,s);
            out.println(d);
        }
    }
}
