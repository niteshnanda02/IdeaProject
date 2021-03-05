package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class Twins {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextSortedIntArray(n);
        int s=sum(a,0);
        int ss=0;
        int min=0;
        for (int i = n-1; i >=0 ; i--) {
            ss+=a[i];
            min++;
            if (ss>(s/2))
                break;
        }
        out.print(min);
    }

    private int sum(int[] a, int i) {
        int s=0;
        for (int j = i; j <a.length ; j++) {
            s+=a[i];
        }
        return s;
    }
}
