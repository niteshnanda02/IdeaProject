package codeforce13July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            long[] a=in.nextLongArray(n);
            long sum=a[0];
            ArrayList<Long> list=new ArrayList<>();
            list.add(a[0]);
            boolean up=false,down=false;
            int i=0;
            for (i = 1; i <n ; i++) {
                if (a[i]>a[i-1]){
                    if (down){
                        list.add(a[i-1]);
                    }
                    up=true;
                    down=false;
                }else {
                    if (up){
                        list.add(a[i-1]);
                    }
                    down=true;
                    up=false;
                }
            }
            if (up|down){
                list.add(a[i-1]);
            }
            out.println(list.size());
            for (int j = 0; j <list.size() ; j++) {
                out.print(list.get(j)+" ");
            }
            out.println();
        }
    }
}
