package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

public class TaskC {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true);
        FastReader fr = new FastReader();
        int t = fr.nextInt();
        while (t-- > 0) {
            int n = fr.nextInt(), k = fr.nextInt();
            int tempn=n,tempk=k;
            int dif=n-k;
            int c=1;
            while (dif!=k-1){
                System.out.print(c+" ");
                c++;
                dif++;
            }
            while (k<=n){
                System.out.print(tempk+" ");
                tempk--;
                k++;
            }
            System.out.println();



        }
    }


}

class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}