package com.company.slidingWindow;

import java.util.HashSet;
import java.util.Set;

public class smallestWindowContainingAllCharacters {
    public static void main(String[] args) {
        System.out.println(smallestWindow("timetopractice", "toc"));
    }

    private static String smallestWindow(String S, String p) {
        Set<Character> set = new HashSet<>();
        for (char x :
                p.toCharArray()) {
            set.add(x);
        }
        int size = set.size();
        String res = "";
        int l = 0, r = 0, count = 0, maxLen = Integer.MAX_VALUE;
        int[] cnt = new int[256];
        while (r < S.length()) {
            char ch = S.charAt(r);
            cnt[ch]++;
            if (cnt[ch] == 1)
                count++;
            if (count == size) {

                while (cnt[S.charAt(l)] > 1) {
                    cnt[S.charAt(l)]--;
                    l++;
                }
                int len = r - l + 1;
                if (maxLen > len) {
                    maxLen = len;
                    res = S.substring(l, r);
                }
            }
                r++;
            }
            return res;
        }
    }
