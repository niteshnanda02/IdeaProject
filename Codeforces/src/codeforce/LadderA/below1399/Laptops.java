package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Laptops {
    class pair{
        int p,q;

        public pair(int p, int q) {
            this.p = p;
            this.q = q;
        }


    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt();
        ArrayList<pair> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(new pair(in.nextInt(),in.nextInt()));
        }
        Collections.sort(list, new Comparator<pair>() {
            @Override
            public int compare(pair pair, pair t1) {
                return pair.p-t1.p;
            }
        });
        boolean flag=true;
        for (int i = 0; i <list.size()-1 ; i++) {
            if (list.get(i).p<list.get(i+1).p&&list.get(i).q>list.get(i+1).q){
                flag=false;
                break;
            }
        }
        if (!flag){
            out.println("Happy Alex");
        }else
            out.println("Poor Alex");
    }
}
