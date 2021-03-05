package Codeforces4June;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(in.nextInt());
            }
            Collections.sort(list);
            boolean v=false;
            int k;
            for (k = 1; k <=1024 ; k++) {
                ArrayList<Integer> update=new ArrayList<>();
                for (int i = 0; i <list.size() ; i++) {
                    int u=list.get(i)^k;
                    update.add(u);
                }
                Collections.sort(update);

                v=list.equals(update);
                if (v)
                    break;
            }
            if (v){
                out.println(k);
            }
            else
                out.println(-1);


        }
    }
}
