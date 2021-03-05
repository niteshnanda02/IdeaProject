package codeforceString;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class SinghalandEquality {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            String s = in.nextString();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
            }
            Collection<Integer> collection = map.values();
            HashMap<Integer, Integer> occur = new HashMap<>();
            for (Integer i : collection) {
                occur.put(i,occur.getOrDefault(i,0)+1);
            }
            Collection<Integer> value=occur.values();
            int max = 0;
            for (Integer i : value) {
                max = Integer.max(max, i);
            }
            out.println(occur.size()-1);
        }
    }
}
