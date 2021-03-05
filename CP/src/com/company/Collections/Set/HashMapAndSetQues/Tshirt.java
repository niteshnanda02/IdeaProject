package com.company.Collections.Set.HashMapAndSetQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.Map;
import java.util.Objects;

public class Tshirt {
    public static class Buying{
        long price;
        int a,b;

        public Buying(long price, int a, int b) {
            this.price = price;
            this.a = a;
            this.b = b;
        }

        @Override
        public String toString() {
            return "Buying{" +
                    "price=" + price +
                    ", a=" + a +
                    ", b=" + b +
                    '}';
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String l = reader.readLine();
        String[] arr = l.split(" ");
        long[] p = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = Long.parseLong(arr[i]);
        }
        l = reader.readLine();
        arr = l.split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
        }

        l = reader.readLine();
        arr = l.split(" ");
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(arr[i]);
        }
        List<Buying> list=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(new Buying(p[i],a[i],b[i]));
        }
        Collections.sort(list, new Comparator<Buying>() {
            @Override
            public int compare(Buying buying, Buying t1) {
                return (int) (buying.price-t1.price);
            }
        });
        int m = Integer.parseInt(reader.readLine());
        l = reader.readLine();
        arr = l.split(" ");
        for (int i = 0; i < m; i++) {
            int color = Integer.parseInt(arr[i]);

        }
    }
}
