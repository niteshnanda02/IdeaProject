package codeforces12Sep2020;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class TaskB {

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            long[] arr = in.nextSortedLongArray(n);
            long m1 = arr[n-1]*arr[n-2]*arr[n-3]*arr[n-4]*arr[n-5];

            long m2 = arr[n-1]*arr[0]*arr[1]*arr[2]*arr[3];

            long m3 = arr[n-1]*arr[n-2]*arr[n-3]*arr[0]*arr[1];

            long res = Math.max(m1, Math.max(m2, m3));

            out.println(res);
        }
    }
}