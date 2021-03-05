package codeforces17July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.TreeMap;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();

        while (testNumber-->0){
            TreeMap<Long,Long> map=new TreeMap<>();
            for (int i = 0; i <3 ; i++) {
                long val=in.nextLong();
                if(map.size()>0&&map.get(val)!=map.get(map.lastKey())){
                    map.put(val,map.get(val)+1);
                }else {
                    map.put(val,1L);
                }
            }
            long c=map.get(map.lastKey());
            if(c>=2){
                out.println("YES");
                out.println(map.firstKey()+" "+map.firstKey()+" "+map.lastKey());
            }else {
                out.println("NO");
            }
        }
    }
}
