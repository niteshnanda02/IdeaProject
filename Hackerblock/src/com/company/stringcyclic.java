package com.company;

public class stringcyclic {
    public static void main(String[] args) {
        System.out.println(cyclicString("ccccccc"));
    }
   static int cyclicString(String s) {
       char m=max(s);
       String str="";
       for(char i='a';i<=m;i++){
           str+=Character.toString(i);
       }
       String res=str;
       while(!res.contains(s)){
           res+=str;
       }
       System.out.println(res);
       return res.length()/str.length();
   }
   static char max(String s){
        char c='\0';
        for(int i=0;i<s.length();i++){
            if(c<s.charAt(i)){
                c=s.charAt(i);
            }
        }
        return c;
    }

}
