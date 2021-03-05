package com.company.Collections.Set.HashMapAndSetQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class TomRiddleDiary {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        Set<String> set=new HashSet<>();
        for (int i = 0; i <n ; i++) {
            String s=reader.readLine();
            if (set.contains(s)){
                System.out.println("YES");
            }else {
                set.add(s);
                System.out.println("NO");
            }
        }
    }
}
