package codeforce7june;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Vector;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] posa=new int[n+1];
        int[] posb=new int[n+1];
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextInt();
            posa[a[i]]=i;
        }
        for (int i = 0; i <n ; i++) {
            b[i]=in.nextInt();
            posb[b[i]]=i;
        }
        Vector<Integer> count=new Vector<>(n);
        for (int i = 0; i <n ; i++) {
            count.add(0);
        }
        int ans=0;
        for (int i = 1; i <=n ; i++) {
            int index=(posb[i]-posa[i]+n)%n;
            int v=count.get(index);
            count.set(index,v+1);
        }
        for (int i = 0; i <n ; i++) {
            ans=Math.max(ans,count.get(i));
        }
        out.println(ans);
    }
}
