package codeforce.LadderA.below1399;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class RomaAndChangingSigns {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n=in.nextInt(),k=in.nextInt();
        ArrayList<Integer> positive=new ArrayList<>();
        ArrayList<Integer> negative=new ArrayList<>();
        int check=k/n;
        int mul=1;
        if (check%2!=0){
            mul=-1;
        }
        k=k%n;
        long ans=0;
        for (int i = 0; i <n ; i++) {
            int v=in.nextInt();
            v*=mul;
            if (v>=0)
                positive.add(v);
            else
                negative.add(v);
        }
        Collections.sort(positive);
        Collections.sort(negative);
        for (int i = 0; i <negative.size() ; i++) {
            if (k!=0){
                ans+=negative.get(i)*-1;
                k--;
            }else
                ans+=negative.get(i);
        }
        for (int i = 0; i <positive.size() ; i++) {
            if (k!=0){
                ans+=positive.get(i)*-1;
                k--;
            }else
                ans+=positive.get(i);
        }
        out.println(ans);

    }
}
