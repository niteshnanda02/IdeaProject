package com.company.BackTracking;

import java.util.Arrays;
import java.util.Collections;

public class palindromePartioning {
        static int palindromicPartition(String str)
        {
            // code here
            solve(str,"");
            return 3;
        }
        static void solve(String str,String ans){
            if(str.length()==0){
                System.out.println(ans);
                return;
            }
            for(int i=0;i<str.length();i++){
                String prefix=str.substring(0,i+1);
                String ros=str.substring(i+1);
                if(ispali(prefix)){
                    solve(ros,ans+"("+prefix+")");
                }
            }
        }
        static boolean ispali(String s){
            int li=0,ri=s.length()-1;
            while(li<ri){
                if(s.charAt(li)!=s.charAt(ri))
                    return false;
                li++;
                ri--;
            }
            return true;
        }

    public static void main(String[] args) {
        System.out.println(palindromicPartition("aaa"));
    }
    }
