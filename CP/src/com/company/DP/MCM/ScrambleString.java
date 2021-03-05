package com.company.DP.MCM;

import java.util.HashMap;
import java.util.Map;

public class ScrambleString {
    static Map<String,Boolean> map=new HashMap<>();
    public boolean isScramble(String s1, String s2) {
        if(s1.length()!=s2.length())
            return false;
        if(s1.length()==0&&s2.length()==0)
            return true;
        map.clear();
        return scramble(s1,s2);
    }

    boolean scramble(String s1,String s2){
        if(s1.equals(s2))
            return true;
        if(s1.length()<=1)
            return false;

        String key=s1+" "+s2;
        if(map.containsKey(key))
            return map.get(key);
        boolean flag=false;
        int n=s1.length();
        for(int k=1;k<=n-1;k++){
            //case1 : Swap
            boolean case1=false;
            if(scramble(s1.substring(0,k),s2.substring(n-k,n))
                    && scramble(s1.substring(k,n),s2.substring(0,n-k)))
                case1=true;

            //case2: Not Swap
            boolean case2=false;
            if(scramble(s1.substring(0,k),s2.substring(0,k))
                    && scramble(s1.substring(k,n),s2.substring(k,n)))
                case2=true;

            if(case1||case2){
                flag=true;
                break;
            }

        }
        map.put(key,flag);
        return flag;
    }
}
