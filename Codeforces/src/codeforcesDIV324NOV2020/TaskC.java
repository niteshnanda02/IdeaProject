package codeforcesDIV324NOV2020;
import java.util.*;
import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        Map<Integer,List<Integer>> map=new HashMap<>();
        while (testNumber-->0){
            map.clear();
            int n=in.nextInt();
            for (int i = 0; i <n ; i++) {
                int v=in.nextInt();
                List<Integer> l=new ArrayList<>();
                if(map.containsKey(v)){
                   l=map.get(v);
                   l.add(i);
                   map.put(v,l);
                }else {
                    l.add(i);
                    map.put(v,l);
                }
            }

            int ans=Integer.MAX_VALUE;
            Set<Integer> keys=map.keySet();
            for (int key:keys) {
                List<Integer> l=map.get(key);
                int c=0,prev=-1;
                for (int i = 0; i <l.size() ; i++) {
                    int temp=l.get(i)-prev;
                    if(temp>1){
                        c++;
                    }
                    prev=l.get(i);
                }
                if(prev!=n-1)
                    c++;
                ans=Math.min(ans,c);
            }
            out.println(ans);

        }
    }
}
