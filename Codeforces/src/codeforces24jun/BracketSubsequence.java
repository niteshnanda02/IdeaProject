package codeforces24jun;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class BracketSubsequence {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.nextString();
        String o = "";
        if (k == n) {
            out.println(s);
        } else {
            Deque<Character> deque = new LinkedList<>();

            for (int i = 0; i < n; i++) {
                char cc = s.charAt(i);
                if (cc == '(')
                    deque.addFirst('(');
                if (cc == ')') {
                    deque.addLast(')');
                }
            }
            ArrayList<Character> list = new ArrayList<>(deque);
            int start = 0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == ')') {
                    start = i - 1;
                    break;
                }
            }
            int l = start, r = start + 1;
            while (k > 0 && l >= 0 && r < n) {
                o += list.get(l);
                o += list.get(r);
                l--;
                r++;
                k -= 2;
            }

            out.println(o);
        }
    }
}