package codeforces19sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskD1 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        long[] a=in.nextSortedLongArray(n);

        out.println((n%2==0?(n/2)-1:(n/2)));
        int l=0,r=n/2;
        while (l<n/2&&r<n){
            out.print(a[r]+" ");
            r++;
            out.print(a[l]+" ");
            l++;
        }
        while (r<n){
            out.print(a[r]+" ");
            r++;
        }
        out.println();
    }
}
