//package com.company;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.StringTokenizer;
//
//public class Main {
//
//    public static void main(String[] args) {
//        PrintWriter out=new PrintWriter(System.out,true);
//        FastReader fr = new FastReader();
//        int t=fr.nextInt();
//        while (t-->0){
//            long ans=0;
//            int N=fr.nextInt();
//            long div=Long.parseLong(fr.next());
//            List<combine> list=new ArrayList<>();
//            for (int i = 0; i <N ; i++) {
//                list.add(new combine(Long.parseLong(fr.next()),1));
//            }
//            int j=0;
//            while (j<list.size()){
//                long elem=list.get(j).elem;
//                long freq=list.get(j).freq;
//                if (elem%div==0){
//                    ans+=elem*freq;
//                    list.add(new combine(elem/div,freq*div));
//                }else{
//                    break;
//                }
//                j++;
//            }
//            while (j<list.size()){
//                long elem=list.get(j).elem;
//                long freq=list.get(j).freq;
//                ans+=elem*freq;
//                j++;
//
//            }
//            System.out.println(ans);
//        }
//    }
//    static class combine {
//        long elem,freq;
//
//        public combine(long elem, long freq) {
//            this.elem = elem;
//            this.freq = freq;
//        }
//    }
//
//}
