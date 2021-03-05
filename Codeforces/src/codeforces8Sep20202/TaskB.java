package codeforces8Sep20202;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class TaskB {
    private class pair {
        int val, gcd;

        public pair(int val, int gcd) {
            this.val = val;
            this.gcd = gcd;
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber = in.nextInt();
        while (testNumber-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            int max = 0;
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            max=a[n-1];
//            PriorityQueue<pair> queue = new PriorityQueue<>(new Comparator<pair>() {
//                @Override
//                public int compare(pair pair, pair t1) {
//                    return t1.gcd - pair.gcd;
//                }
//            });
//            for (int i = 0; i < n; i++) {
//                if (a[i] != max) {
//                    int v=gcd(max,a[i]);
//                    pair p = new pair(a[i], v);
//                    queue.add(p);
//                }
//            }
//            out.print(max);
//            while (!queue.isEmpty()){
//                out.print(" "+queue.poll().val);
//            }
//            out.println();

            ArrayList<Integer> ans=new ArrayList<>();
            ans.add(max);
            int[] visited=new int[n];
            Arrays.fill(visited,0);
            while (ans.size()!=n){
                int ind=n-2;
                int m=0;
                for (int i = n-2; i >=0 ; i--) {
                    if (visited[i]==0){
                        int t=gcd(max,a[i]);
                        if(t>m){
                            m=t;
                            ind=i;
                        }
                    }
                }
                max=m;
                visited[ind]=1;
                ans.add(a[ind]);
            }

            for (int i = 0; i <ans.size() ; i++) {
                out.print(ans.get(i)+" ");
            }

            out.println();
        }
    }

    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}
