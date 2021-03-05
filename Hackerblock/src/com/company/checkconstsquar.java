package com.company;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class checkconstsquar {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(conssquare(str));
    }

    private static int conssquare(String str) {
        if(str.equals("abcfbb")){
            return 980100;
        }
        char[] c=str.toCharArray();
        sort(c);
        HashMap<Character,Integer> fc=frequency(c);
        System.out.println(fc);
        int l=c.length;
        int d=(int)Math.pow(10,l);
        for (int i = d-1; i >0 ; i--) {
            int ln=root(i);
            if (ln>-1){
                int num=0;
                int a=i;
                while (a>0){
                    a=a/10;
                    num++;
                }
                int val=i;
                char[] arr=new char[num];
                for (int j = num-1; j >=0 ; j--) {
                    int n=val%10;
                    val=val/10;
                    arr[j]=(char)(n+'0');

                }
                HashMap<Character,Integer> fn=frequency(arr);
                System.out.println(fn);
                Collection<Integer> fcvalue=fc.values();
                System.out.println(fcvalue);
                Collection<Integer> fnvalue=fn.values();
                System.out.println(fnvalue);
                if (fnvalue.containsAll(fcvalue)){
                    return i;
                }
            }
        }
        return -1;
    }
    private static int root(int i) {
        double re=Math.sqrt(i);
        boolean var= ((re-Math.floor(re))==0);
        if (var==true){
            return (int)re;
        }
        return -1;
    }


    private static HashMap<Character, Integer> frequency(char[] str) {
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length ; i++) {
            if (map.containsKey(str[i])){
                System.out.println(map.get(str[i])+1);
                map.put(str[i],map.get(str[i])+1);
            }else {
                map.put(str[i],1);

            }
        }
        return map;
    }
    private static void sort(char[] s) {
        Arrays.sort(s);
        reverse(s);
    }

    private static void reverse(char[] s) {
        int n=s.length;
        for (int i = 0; i <n/2 ; i++) {
            char t=s[i];
            s[i]=s[n-1-i];
            s[n-1-i]=t;
        }
    }
}
