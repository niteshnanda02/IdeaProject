package codeforces28July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt(), k = in.nextInt();
            Vector<Long> vector = new Vector<>();
            HashMap<Long, Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long v = in.nextLong();
                vector.add(v);
                long rem = (v > k) ? v % k : k % v;
                v += rem;
                map.put(v, map.getOrDefault(v, 0L) + 1L);
            }
            Collection<Long> collection = map.values();
            long max = Collections.max(collection);
            Set<Map.Entry<Long, Long>> entries = map.entrySet();
            ArrayList<Long> list = new ArrayList<>();
            for (Map.Entry<Long, Long> entry : entries) {
                if (entry.getValue() == max) {
                    list.add(entry.getValue());
                }
            }
            if (list.size() == 1) {
                out.println(list.get(0));
            } else {
                for (int i = 1; i < list.size(); i++) {
                    long prev=list.get(i-1);


                }
                out.println(list.get(list.size() - 1));
            }
        }
    }
}
