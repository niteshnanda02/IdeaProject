package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Codejam3 {
    public static void main(String[] args) {
        int t = 0;
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        t = s.nextInt();
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            HashMap<Long, Integer> map = new HashMap<>();
            int n = s.nextInt();
            int d = s.nextInt();
            long[] a = new long[n];
            for (int j = 0; j < n; j++) {
                a[j] = s.nextLong();
                if (map.containsKey(a[j]))
                    map.put((long) a[j], map.get(a[j]) + 1);
                else
                    map.put((long) a[j], 1);
            }
            int ans = check(map, n, d, a);


            builder.append("Case #" + i + ": " + ans).append("\n");
        }
        System.out.println(builder);
    }

    private static int check(HashMap<Long, Integer> map, int n, int d, long[] a) {
        boolean val = get(map, d);
        int ans = Integer.MAX_VALUE;
        Arrays.sort(a);
        if (val) {
            ans = 0;
        }
        if (!val) {
            for (int j = 0; j < n; j++) {
//                if (d - j > 0) {
//                    double sa = (double) a[j];
//                    double div = d - j;
//                    double ch = sa / div;
//                    int c = 0;
//                    while ((float) sa != (float) ch) {
//                        sa -= ch;
//                        c++;
//                    }
//                    if (c > 0)
//                        if (ans > c)
//                            ans = c;
//                } else
//                    break;
                if (d == 2) {
                    ans=1;

                }
                else if(d==3){
                    if(n==1)
                        ans=2;
                    else {
                        for (int i = 1; i <n ; i++) {
                            long v=a[i-1];
                            long ch=a[i];
                            long div=ch%v;
                             
                        }
                    }
                }

                }
            }
            return ans;
        }

        private static boolean get (HashMap < Long, Integer > map,int d){
            Set<Map.Entry<Long, Integer>> entrySet = map.entrySet();
            for (Map.Entry<Long, Integer> entries :
                    entrySet) {
                if (entries.getValue() == d)
                    return true;

            }
            return false;
        }
    }
