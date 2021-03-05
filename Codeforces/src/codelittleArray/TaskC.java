package codelittleArray;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskC {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int[] x = new int[3];
        int[] y = new int[3];
        int[] pos = new int[10005];
        for (int i = 0; i < 3; i++) {
            x[i] = in.nextInt();
            y[i] = in.nextInt();
            pos[x[i]] = y[i];
        }
        Arrays.sort(x);
        Arrays.sort(y);
        out.println(x[2] - x[0] + y[2] - y[0] + 1);
        for (int i = x[0]; i < x[1]; i++) {
            out.println(i + " " + pos[x[0]]);
        }

        for (int i = y[0]; i <= y[2]; i++) {
            out.println(x[1] + " " + i);
        }
        for (int i = x[1] + 1; i <= x[2]; i++) {
            out.println(i + " " + pos[x[2]]);
        }
    }
}
