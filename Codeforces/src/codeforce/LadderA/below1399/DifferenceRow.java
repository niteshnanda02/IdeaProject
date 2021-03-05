package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class DifferenceRow {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        int[] a=in.nextSortedIntArray(n);
        int left=0,right=n-1;
        while (left<right){
            if (left%2==0){
                int t=a[left];
                a[left]=a[right];
                a[right]=t;
            }
            left++;
            right--;
        }
        for (int i = 0; i <n ; i++) {
            out.print(a[i]+" ");
        }
        out.println();

    }
}
