package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class minimumnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        String a = s.next(), b = s.next();
        System.out.println(check(a, b));

    }

    private static int check(String a, String b) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length(); i++) {
            if (map.containsKey(a.charAt(i))) {
                map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
            } else {
                map.put(a.charAt(i), 1);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            if (map.containsKey(b.charAt(i))) {
                if (map.get(b.charAt(i)) > 0)
                    map.put(b.charAt(i), map.get(b.charAt(i)) - 1);
            }
        }
        Collection<Integer> values = map.values();
        int ans = 0;
        for (Integer val : values
        ) {
            ans += val;
        }
        return ans;
    }
}
