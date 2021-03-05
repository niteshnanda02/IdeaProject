package com.company.Questions;
import java.util.*;
public class WordBreak {
    static Map<String,List<String>> map=new HashMap<>();
    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            int n=s.nextInt();
            ArrayList<String> B=new ArrayList<>();
            for(int i=0;i<n;i++){
                B.add(s.next());
            }
            String A=s.next();
            System.out.println(word(A,B));
        }
    }
    static List<String> word(String A,ArrayList<String> B){

        if(map.containsKey(A))
            return map.get(A);

        List<String> res=new ArrayList<>();
        if(B.contains(A))
            res.add(A);
        for(int k=1;k<=A.length()-1;k++){
            String first=A.substring(0,k);
            if(B.contains(first)){

                List<String> mr=word(A.substring(k),B);
                for (String word:mr
                     ) {
                    res.add(first+" "+word);
                }
                System.out.println(mr);
            }


        }
        map.put(A,res);
        return res;
    }
}
