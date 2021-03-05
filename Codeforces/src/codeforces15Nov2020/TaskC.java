package codeforces15Nov2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskC {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long w=in.nextLong();
            long[][] a=new long[n][2];
            for (int i = 0; i <n ; i++) {
                a[i][0]=in.nextLong();
                a[i][1]=(i+1);
            }
            Arrays.sort(a, new Comparator<long[]>() {
                @Override
                public int compare(long[] longs, long[] t1) {
                    return Long.compare(longs[0],t1[0]);
                }
            });
            long sum=0;
            List<Integer> l=new ArrayList<>();
            int i;
            for (i = n-1; i >=0 ; i--) {
                if(a[i][0]>w)
                    continue;
                sum+=a[i][0];
                l.add((int) a[i][1]);
                if(sum>=(w/2+w%2))
                    break;
            }
            if(i==-1)
                out.println(-1);
            else {
                out.println(l.size());
                Collections.sort(l);
                for (int j = 0; j <l.size() ; j++) {
                    out.print(l.get(j)+" ");
                   }
                out.println();
            }


        }
    }
}
