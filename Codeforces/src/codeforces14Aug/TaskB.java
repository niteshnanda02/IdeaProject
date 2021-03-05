package codeforces14Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Collections;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        ArrayList<Integer> list;
        while (testNumber-->0){
            list=new ArrayList<>();
            String s=in.nextString();
            int c=0;
            boolean temp=false;
            for (int i = 0; i <s.length() ; i++) {
                char ch=s.charAt(i);
                if (ch=='1'){
                    if (i==s.length()-1){
                        temp=true;
                    }
                    c++;
                }else {
                    if (c>0){
                        list.add(c);
                    }
                    c=0;
                }
            }
            if (temp){
                if(c>0)
                    list.add(c);
            }
            int ans=0;
            Collections.sort(list);
            for (int i = list.size()-1; i >=0 ; i-=2) {
                ans+=list.get(i);
            }
            out.println(ans);
        }
    }
}
