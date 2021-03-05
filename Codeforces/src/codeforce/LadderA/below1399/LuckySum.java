package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class LuckySum {
    private ArrayList<Long> list=new ArrayList<>();
    private long max= (long) Math.pow(10,10);
    private void gen(long curr){
        if (curr>max)
            return;
        list.add(curr);
        gen(10*curr+4);
        gen(10*curr+7);
    }
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        gen(0);
        long l=in.nextLong(),r=in.nextLong();
        long ans=0;
        Collections.sort(list);
        for (int i = 1; i <list.size() ; i++) {
            ans+=list.get(i)*intersect(list.get(i-1)+1,list.get(i),l,r);
        }
        out.println(ans);
    }

    private Long intersect(long a, Long b, long c, long d) {
        return Math.max(0,Math.min(b,d)-Math.max(a,c)+1);
    }
}
