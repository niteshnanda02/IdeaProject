package codeForces5Feb2020;

import FastIO.InputReader;
import FastIO.OutputWriter;
import java.util.*;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long k=in.nextLong();
            int[] a=in.nextIntArray(n);

            int pos=-1;
            while (k-->0){
                int i=0;
                boolean check=true;
                while (i<n-1){
                    if(a[i]<a[i+1]){
                        a[i]+=1;
                        pos=i+1;
                        check=false;
                        break;
                    }
                    i++;
                }

                if(check){
                    pos=-1;
                    break;
                }
            }
            out.println(pos);
        }
    }
}
