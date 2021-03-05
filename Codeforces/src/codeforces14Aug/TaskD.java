package codeforces14Aug;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskD {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int r = in.nextInt(), g = in.nextInt(), b = in.nextInt();
        PriorityQueue<Integer> rq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        PriorityQueue<Integer> bq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        PriorityQueue<Integer> gq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return t1 - integer;
            }
        });
        for (int i = 0; i < r; i++) {
            rq.add(in.nextInt());
        }

        for (int i = 0; i < g; i++) {
            gq.add(in.nextInt());
        }

        for (int i = 0; i < b; i++) {
            bq.add(in.nextInt());
        }

        long ans = 0;
        while (!rq.isEmpty() && !bq.isEmpty() && !gq.isEmpty()) {
            int f, s;
            int x = rq.peek(), y = bq.peek(), z = gq.peek();
            if (x > y && x > z) {
                f = x;
                rq.poll();
                if (y > z) {
                    s = y;
                    bq.poll();
                } else {
                    s = z;
                    gq.poll();
                }
            } else if (y > z) {
                f = y;
                bq.poll();
                if (x > z) {
                    s = x;
                    rq.poll();
                } else {
                    s = z;
                    gq.poll();
                }
            } else {
                f = z;
                gq.poll();
                if (x > y) {
                    s = x;
                    rq.poll();
                } else {
                    s = y;
                    bq.poll();
                }
            }
            ans += (f * s);
        }

        while (!rq.isEmpty() && !bq.isEmpty()) {
            int f = rq.poll(), s = bq.poll();
            ans += (f * s);
        }

        while (!bq.isEmpty() && !gq.isEmpty()) {
            int f = bq.poll(), s = gq.poll();
            ans += (f * s);
        }

        while (!rq.isEmpty() && !gq.isEmpty()) {
            int f = rq.poll(), s = gq.poll();
            ans += (f * s);
        }
        out.println(ans);
    }
}
