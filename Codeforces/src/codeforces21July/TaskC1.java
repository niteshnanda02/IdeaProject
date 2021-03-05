package codeforces21July;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.*;

public class TaskC1 {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        List<Integer> list = new ArrayList<>();
        while (testNumber-- > 0) {
            list.clear();
            int n = in.nextInt();
            String a = in.nextString(), b = in.nextString();
            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            for (int i = n - 1; i >= 0; i--) {
                if (A[i]==B[i]){

                }

                if (A[0] == B[i]) {
                    prefix(A, 1);
                    prefix(A, i+1);
                    list.add(1);
                        list.add(i + 1);
                } else {
                    prefix(A, i+1);
                    list.add(i + 1);
                }
            }
            out.print(list.size());
            for (int i = 0; i < list.size(); i++) {
                out.print(" " + list.get(i));
            }
            out.println();
        }
    }

    private void prefix(char[] a, int e) {
        for (int i = 0; i < e; i++) {
            if (a[i] == '0')
                a[i] = '1';
            else
                a[i] = '0';
        }
        reverse(a, e);
    }

    private void reverse(char[] a, int e) {
        int s = 0;
        e--;
        while (s < e) {
            char t = a[s];
            a[s] = a[e];
            a[e] = t;
            s++;
            e--;
        }
    }

}
