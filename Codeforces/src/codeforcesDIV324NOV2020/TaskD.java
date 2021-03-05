package codeforcesDIV324NOV2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TaskD {
    static Map<Long,Long> map=new TreeMap<>();
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
            long n=in.nextLong();
            map.clear();
            factor(n);
            long count=0,key=0;
            Set<Map.Entry<Long,Long>> entries=map.entrySet();
            for (Map.Entry<Long,Long> e:entries
                 ) {
                if(e.getValue()>=count) {
                    count = e.getValue();
                    key=e.getKey();
                }
            }
            out.println(count);
            for (int i = 0; i <count-1 ; i++) {
                out.print(key+" ");
            }
            long rem= (long) (n/Math.pow(key,count-1));
            out.println(rem);
        }
    }

    private void factor(long n) {

        for (long i = 2; i*i <=n ; i++) {
            while (n%i==0){
                map.put(i,map.getOrDefault(i,0L)+1);
                n=n/i;
            }
        }
        map.put(n,1L);
    }
}
