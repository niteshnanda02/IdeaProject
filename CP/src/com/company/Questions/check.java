package com.company.Questions;

import org.w3c.dom.Node;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class check {

    public static void main(String[] args) throws ParseException {
        PriorityQueue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                return 0;
            }
        });
        
//
//        Scanner s=new Scanner(System.in);
//        String st=s.nextLine();
//        solve(st);
        System.out.println(Arrays.toString(asteroidCollision(new int[]{1,-2,-2,-2})));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        List<Integer> l=new ArrayList<>();
        int n=asteroids.length;
        Stack<Integer> s=new Stack();
        for(int i=0;i<n;i++){
            if(s.isEmpty()||asteroids[i]>0){
                s.push(asteroids[i]);
            }else if(asteroids[i]<0){
                if(s.peek()>Math.abs(asteroids[i]))
                    continue;
                else{
                    boolean t=false;
                    while(!s.isEmpty()&&s.peek()>0&&(s.peek()<=Math.abs(asteroids[i]))){
                        int v=s.peek();
                        s.pop();
                        if(v==Math.abs(asteroids[i])){
                            t=true;
                        }
                        if(t)
                            break;

                    }

                    if((s.isEmpty()||s.peek()<0)&&!t)
                        s.push(asteroids[i]);
                }
            }
        }


        int[] a=new int[s.size()];
        for(int i=s.size()-1;i>=0;i--)
            a[i]=s.pop();

        return a;
    }
    private static void solve(String st) throws ParseException {
        String str2 = "";

        Set<String> uniqueDates = new HashSet<>();

        for (int i = 0; i < st.length(); i++) {

            if (Character.isDigit(st.charAt(i))) {
                str2 += (st.charAt(i));
            }

            // if we found - then clear the str2
            if (st.charAt(i) == '-') {
                str2 = "";
            }

            // if length of str2 becomes 4
            // then store it in a set
            if (str2.length() == 4) {
                uniqueDates.add(str2);
                str2 = "";
            }
        }

        // return the size of set
        System.out.println(uniqueDates.size());
    }
}
