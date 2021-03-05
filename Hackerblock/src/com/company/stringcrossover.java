package com.company;

import java.util.ArrayList;

public class stringcrossover {
    public static void main(String[] args) {
        String[] inputArray={"a",
                "b",
                "c",
                "d",
                "e"};
        String result="c";
        System.out.println(crossover(inputArray,result));
    }

    private static int crossover(String[] inputArray, String result) {
        ArrayList<String> list=new ArrayList<>();

        for (int i = 0; i <inputArray.length ; i++) {
            String ch=inputArray[i];
            String res="";
            for (int j = 0; j <ch.length() ; j++) {
                if (ch.charAt(j)==result.charAt(j)){
                    res+="0";
                }else {
                    res+="1";
                }
            }
            list.add(res);
        }
        System.out.println(list);
        int pair=0;
        for (int i = 0; i <list.size() ; i++) {
            int c1=Integer.parseInt(list.get(i));
            for (int j = i+1; j <list.size() ; j++) {
                int c2=Integer.parseInt(list.get(j));
                    if((c1&c2)==0){
                        pair++;
                    }
                }
            }
        return pair;
    }
}
