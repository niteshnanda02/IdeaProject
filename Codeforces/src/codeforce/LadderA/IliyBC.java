package codeforce.LadderA;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class IliyBC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        if (n < 0) {
            String s = String.valueOf(n);
            int b1 = Integer.parseInt(String.valueOf(s.charAt(s.length() - 1)));
            int b2 = Integer.parseInt(String.valueOf(s.charAt(s.length() - 2)));
            if (b1 > b2) {
                int v = Integer.parseInt(s.substring(0, s.length() - 1));
                out.println(v);
            } else {
                String r = s.substring(0, s.length() - 2);
                if (r.length() == 1) {
                    if (b1 == 0)
                        out.println(b1);
                    else
                        out.println("-" + b1);
                } else {
                    int v = Integer.parseInt(r);
                    out.println(v + "" + b1);
                }
            }
        } else
            out.println(n);
    }
}
