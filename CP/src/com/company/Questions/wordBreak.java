package com.company.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class wordBreak {
    static String[]   arr = { "i", "like", "sam", "sung", "samsung", "mobile",
            "ice","cream", "icecream", "man", "go", "mango" };
    static List<String> B =Arrays.asList(arr);

    public static int wordBreak(String A )
    {
        //code here


        return word(A);
    }

    static int word(String A){



        int flag=0;
        for(int k=1;k<=A.length()-1;k++){
            String first=A.substring(0,k);
            if(B.contains(first)){

                if(word(A.substring(k,A.length()))==1){
                    flag=1;
                    break;
                }

            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(wordBreak("ilike"));
    }
}
