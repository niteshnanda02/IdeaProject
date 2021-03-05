package com.company.Collections.Set.HashMapAndSetQues;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BoxPacking {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String l = reader.readLine();
        String[] a = l.split(" ");
        TreeMap<String, Integer> map = new TreeMap<>();
        int maxvalue=0;
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            maxvalue=Math.max(maxvalue,map.get(a[i]));
        }
        System.out.println(maxvalue);
    }
}
