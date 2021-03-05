package com.company.Questions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class array {
    static String secFrequent(String arr[], int N)
    {
        // your code here
        Map<String,Integer> map=new HashMap<>();
        for(String s: arr){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> stringIntegerEntry, Map.Entry<String, Integer> t1) {
                return t1.getValue()-stringIntegerEntry.getValue();
            }
        });
        return list.get(1).getKey();
    }
    public static void main(String[] args) throws IOException {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            String str=s.next();
            int n=str.length();
            int c=0;
            int bal=0;
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='['){
                    bal++;
                }else{
                    bal--;
                }
                if(bal<0)
                    c++;

            }
            System.out.println(c);
        }
    }
}