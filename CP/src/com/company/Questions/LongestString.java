package com.company.Questions;

import java.util.*;

public class LongestString {
    static int solve(String s){
        Map<Character,Integer> map=new HashMap<>();
        Queue<Character> queue=new LinkedList<>();
        int max=0;
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                while(map.containsKey(ch)&&!queue.isEmpty()){
                    char rv=queue.remove();
                    map.remove(rv);
                }
            }
            map.put(ch,1);
            queue.add(ch);
            max=Math.max(queue.size(),max);
        }
        return max;
    }
    public static void main (String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.next();
        int ans=solve(str);
        System.out.println(ans);
    }
}
