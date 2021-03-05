package com.company.greedy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class NmeetinginOneRoom {
    private static class pair implements Comparable<pair>{
        int s,f;

        public pair(int s, int f) {
            this.s = s;
            this.f = f;
        }

        @Override
        public int compareTo(pair pair) {
            return this.f-pair.f;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            HashMap<pair,Integer> map=new HashMap<>();
            int n=s.nextInt();
            int[] S=new int[n];
            int[] F=new int[n];
            for (int i = 0; i <n ; i++) {
                S[i]=s.nextInt();
            }

            for (int i = 0; i <n ; i++) {
                F[i]=s.nextInt();
            }
            pair[] pairs=new pair[n];
            for (int i = 0; i <n ; i++) {
                pair pair=new pair(S[i],F[i]);
                pairs[i]=pair;
                map.put(pair,i);
            }
            Arrays.sort(pairs);
            System.out.print(map.get(pairs[0])+1+" ");
            pair curr=pairs[0];
            for (int i = 1; i <n ; i++) {
                if(pairs[i].s> curr.f){
                    curr=pairs[i];
                    System.out.print(map.get(pairs[i])+1+" ");
                }
            }
            System.out.println();
        }
    }
}
