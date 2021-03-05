package codeforce30may;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.nextString();
            ArrayList<String> res=getSub(s);
            int ans=0;
            while (res.contains("010")||res.contains("101")){
                if (res.contains("010")){
                    ans++;
                    res.remove(new String("010"));
                }
                if (res.contains("101")){
                    ans++;
                    res.remove(new String("101"));
                }
            }
            out.println(ans);
        }
    }
    private static ArrayList<String> getSub(String s){
        if (s.length()==0){
            ArrayList<String> list=new ArrayList<>();
            list.add("");
            return list;
        }
        char ch=s.charAt(0);
        String ros=s.substring(1);

        ArrayList<String> rr=getSub(ros);
        ArrayList<String> mr=new ArrayList<>();
        for (int i = 0; i <rr.size() ; i++) {
            mr.add(rr.get(i));
            mr.add(rr.get(i)+ch);
        }
        return mr;
    }
}
