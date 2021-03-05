package codelittleArray;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            if (i%2==0){
                int val=list.get(i);
                list.remove(i);
                list.add(val);
            }

        }
        for (int i = 0; i <list.size() ; i++) {
            out.print(list.get(i)+" ");
        }
    }
}
