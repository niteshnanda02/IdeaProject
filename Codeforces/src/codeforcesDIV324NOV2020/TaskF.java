package codeforcesDIV324NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskF {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        Map<Integer,List<Integer>> map=new TreeMap<>(Collections.reverseOrder());
        while (testNumber-->0){
            int n=in.nextInt();
            map.clear();
            for (int i = 0; i <n ; i++) {
                int v=in.nextInt();
                List<Integer> list=new ArrayList<>();
                if(map.containsKey(v)){
                    list=map.get(v);
                    list.add(i);
                    map.put(v,list);
                }else {
                    list.add(i);
                    map.put(v,list);
                }
            }
            boolean temp=false;
            int f=0,s=0,t=0;

            Set<Map.Entry<Integer,List<Integer>>> entries=map.entrySet();
            for (Map.Entry<Integer,List<Integer>> e:
                 entries) {
                List<Integer> l=e.getValue();
                if(l.size()>=3){
                    int x=l.get(0);
                    int y=l.get(1);
                    int z=l.get(2);
                    f=x+1;
                    s=y-x+z-y-1;
                    t=n-z;
                    temp=true;
                    break;
                }
                if (temp)
                    break;
            }

            if (temp){
                out.println("YES");
                out.println(f+" "+s+" "+t);
            }else {
                out.println("NO");
            }

        }
    }
}
