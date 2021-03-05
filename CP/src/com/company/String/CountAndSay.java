package com.company.String;

public class CountAndSay {
    public static String countAndSay(int n) {
        String res="1";
        for(int i=2;i<=n;i++){
            String temp="";
            char ch='\0';
            int cnt=0;
            for( char c: res.toCharArray()){
                if(ch=='\0'){
                    ch=c;
                    cnt=1;
                }else if(ch==c)
                    cnt++;
                else{
                    temp+=cnt+ch+"";
                    cnt=1;
                    ch=c;
                }
            }
            if(cnt>0)
                temp+=cnt+""+ch;
            res=temp;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }
}
