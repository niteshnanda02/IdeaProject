package codeforce13July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        long[] a=new long[n];
        ArrayList<Long> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            a[i]=in.nextLong();
            list.add(a[i]);
        }
        boolean check=true;
        long[] b=new long[n];
        for (int i = 0; i <n ; i++) {
            long f=a[i],s=a[n-1];
            boolean flag=true;
            if (f>0){
                flag=false;
                b[i]=0;
            }else {
                for (long j = a[i]+1; j <=s ; j++) {
                    if (!list.contains(a[i])){
                        b[i]=j;
                        flag=false;
                        break;
                    }
                }
            }
            if (flag){
                check=false;
                out.println(-1);
                break;
            }

        }
        if (check){
            for (int i = 0; i <n ; i++) {
                out.print(b[i]+" ");
            }
            out.println();
        }
    }
}
