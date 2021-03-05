package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskE {
    static class p implements Comparable<p>{
        long w,h;

        public p(long w, long h) {
            this.w = w;
            this.h = h;
        }

        @Override
        public int compareTo(p p) {
            if (this.h<=p.h&&this.w<=p.w)
                return -1;
            else if(this.h<=p.w&&this.w<=p.h)
                return -1;
            else
                return 1;
        }

        @Override
        public String toString() {
            return "p{" +
                    "w=" + w +
                    ", h=" + h +
                    '}';
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        Map<p,Integer> map=new HashMap<>();
        while (t-->0){
            map.clear();
            int n=s.nextInt();
            p[] p=new p[n];
            for (int i = 0; i <n ; i++) {
                p[i]=new p(s.nextLong(),s.nextLong());
                map.put(p[i],i+1);
            }
            p[] temp=new p[n];
            for (int i = 0; i <n ; i++) {
                temp[i]=p[i];
            }
            Arrays.sort(p);
            p f=p[0];
            for (int i = 0; i <n ; i++) {
                if ((f.h<temp[i].h&&f.w<temp[i].w)||(f.h<temp[i].w&&f.w<temp[i].h))
                    System.out.print(map.get(f)+" ");
                else
                    System.out.print("-1 ");
            }
            System.out.println();
        }
    }
}
