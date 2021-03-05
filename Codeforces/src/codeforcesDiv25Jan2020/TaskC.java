package codeforcesDiv25Jan2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        Map<Integer,List<Integer>> map=new TreeMap<>(Collections.reverseOrder());
        while (testNumber-->0){
            int n=in.nextInt(),m=in.nextInt();
            int[] k=in.nextIntArray(n);
            long[] c=in.nextLongArray(m);
            map.clear();
            for (int i = 0; i <n ; i++) {
                List<Integer> l=new ArrayList<>();
                if(map.containsKey(k[i])){
                    l=map.get(k[i]);
                }
                l.add(i);
                map.put(k[i],l);
            }
            int start=0;
            long min=0;
            Set<Map.Entry<Integer, List<Integer>>> entry=map.entrySet();
            for (Map.Entry<Integer, List<Integer>> e:entry
                 ) {
                List<Integer> l=e.getValue();
                int key=e.getKey();
                for (int i = l.size()-1; i >=0 ; i--) {
                    if(start<key&&c[start]<=c[key-1]){
                        min+=c[start];
                        start++;
                    }else{
                        min+=c[key-1];
                    }
                }
            }
            out.println(min);
        }
    }
}
