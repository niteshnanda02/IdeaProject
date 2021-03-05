package codeforces19July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {

            int n = in.nextInt();
            String s = in.nextString();
            String pattern = "abacaba";
            int m = pattern.length();
            int i = 0, j = 0, c = 0;
            Map<Integer, Character> map = new HashMap<>();
            while (i < n) {
                char c1 = s.charAt(i);
                char c2 = pattern.charAt(j);
                if (c1 == c2 || c1 == '?') {
                    map.put(i, pattern.charAt(j));
                    i++;
                    j++;
                    if (i % m == 0) {
                        c++;
                        if (i < n - 1) {
                            i = i - j + 1;
                            j = 0;
                        }
                    }
                } else {
                    i++;
                    j = 0;
                }
            }
            if (c == 1) {
                out.println("YES");
                ArrayList<Character> list = new ArrayList<>(map.values());
//                int ind=0;
//                StringBuilder builder=new StringBuilder(s);
//                for (int k = 0; k <n ; k++) {
//                    if(builder.charAt(k)=='?'){
//                        builder.setCharAt(k,list.get(ind));
//                        ind++;
//                    }
//                }
//                out.println(builder.toString());
            } else
                out.println("NO");
        }
    }
}
