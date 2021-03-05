package codeforces12Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Set;
import java.util.TreeSet;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        Set<Integer> set1=new TreeSet<>();
        Set<Integer> set2=new TreeSet<>();
        while (testNumber-->0){
            set1.clear();
            set2.clear();
            int n=in.nextInt();
            int[] a=in.nextIntArray(n);
            boolean t1=true;
            for (int i = 0; i <a.length ; i++) {
                if(!set1.contains(a[i])){
                    set1.add(a[i]);
                }
                else {
                    if(!set2.contains(a[i]))
                        set2.add(a[i]);
                    else {
                        if(t1){
                            set1.add(a[i]);
                            t1=false;
                        }else {
                            set2.add(a[i]);
                            t1=true;
                        }
                    }
                }
            }
            int m1=0,m2=0;
            for (int i:set1
                 ) {
                if(i==m1){
                    m1++;
                }else
                    break;
            }

            for (int i:set2
            ) {
                if(i==m2){
                    m2++;
                }else
                    break;
            }
            out.println((m1+m2));
        }
    }
}
