package codeforceString;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.HashSet;
import java.util.Set;

public class SinghalandBrokenKeyboard {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            String s = in.nextString();
            long count = 0;
            if (s.length() > 0) {
                count = 1;
            }
            long minus = 0;
            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i - 1) == s.charAt(i))
                    minus++;
                count++;
            }
            count = (long) ((Math.pow(2, count) % (Math.pow(10, 9) + 7) - minus % (Math.pow(10, 9) + 7)) % (Math.pow(10, 9) + 7));
            out.println(count);
        }
    }
}
