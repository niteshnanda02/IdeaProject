package codeforces10July;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            String s=in.nextString();
            int bag=0;
            int curr=0,temp=0,res=0;
            for (int i = 0; i <s.length() ; i++) {
                res++;
                char ch=s.charAt(i);
                if(ch=='-'){
                    if(bag>0){
                        bag--;
                        curr=0;
                        continue;
                    }
                    curr--;
                    if(curr<0){
                        res+=i+1;
                        temp++;
                        curr=temp;
                    }
                }else {
                    res+=i+1;
                    bag++;
                    curr++;
                }
            }
            out.println(res);
        }
    }
}
