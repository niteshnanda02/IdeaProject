package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class NextTask {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int c=1;
        int[] a=in.nextSortedIntArray(n);
        for (int i = 0; i <n ; i++) {
            if (a[i]==c){
                c++;
            }else
                break;
        }
        out.println(c);
    }
}
