package JuneCookOff;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class CacheHits {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            int n=in.nextInt(),b=in.nextInt(),m=in.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            for (int i = 0; i <n ; i++) {
                list.add(i);
            }
            int ans=0,prev=-1;
            for (int i = 0; i <m ; i++) {
                int c=in.nextInt();
                int temp=c/b;
                if (temp!=prev){
                    ans++;
                    prev=temp;
                }
            }
            out.println(ans);
        }
    }
}
