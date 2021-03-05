package com.company.Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReorganizeSting {
    public static void main(String[] args) {
        
        System.out.println(new Solution().reorganizeString("aabbbb"));
    }
}
class Solution {

    public String reorganizeString(String S) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        char[] ans=new char[S.length()];
        String res="";
        boolean temp=false;
        int i=0;
        Set<Map.Entry<Character,Integer>> entries=map.entrySet();
        for(Map.Entry<Character,Integer> entry:entries){
            if(entry.getValue()>(Math.ceil(S.length()/2.0))){
                temp=true;
                break;
            }
            for(int j=0;j<entry.getValue();j++){

                ans[i]=entry.getKey();

                i+=2;
                if(i>S.length()-1)
                    i=1;
            }
        }

        if(!temp){
            for(int j=0;j<ans.length;j++)
                res+=ans[j];
        }
        return res;
    }
}
