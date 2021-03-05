package com.company.TwoPointer;

import java.util.LinkedHashSet;
import java.util.Set;

public class PushDominoes {
    public static String pushDominoes(String dominoes) {
        StringBuilder b=new StringBuilder(dominoes);
        int l=0,r=b.length()-1;

        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            if(ch=='L'){
                l=i;
                break;
            }else if(ch=='R')
                break;
        }
        if(l!=0){
            for(int i=0;i<l;i++){
                b.setCharAt(i,'L');
            }
        }

        for(int i=b.length()-1;i>=0;i--){
            char ch=b.charAt(i);
            if(ch=='L'){
                break;
            }else if(ch=='R'){
                r=i;
                break;
            }
        }
        if(r!=b.length()-1){
            for(int i=b.length()-1;i>=r;i--){
                b.setCharAt(i,'R');
            }
        }
        for(int i=l;i<=r;){
            char ch=b.charAt(i);
            if(ch=='R'){
                int ind=0;
                for(int j=i+1;j<=r;j++){
                    char ne=b.charAt(j);
                    if(ne=='L'){
                        ind=j;
                        break;
                    }
                    if(ne=='R')
                        break;
                }
                if(ind!=0){
                    int j=i+1,t=ind-1;
                    while(j<t){
                        b.setCharAt(j,'R');
                        b.setCharAt(t,'L');
                        j++;
                        t--;
                    }
                    i=ind;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        return b.toString();
    }
    public static void main(String[] args) {
//        System.out.println(pushDominoes(".L.R...LR..L.."));
        System.out.println(Math.round(2.4));
    }
}
