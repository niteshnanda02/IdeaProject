package com.company.Questions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        HashMap<Integer,Integer> linkedMap=new LinkedHashMap<>();


        hashMap.put(1,1);
        hashMap.put(3,1);
        hashMap.put(2,1);
        hashMap.put(5,1);
        hashMap.put(6,1);
        linkedMap.put(1,1);
        linkedMap.put(3,1);
        linkedMap.put(2,1);
        linkedMap.put(5,1);
        linkedMap.put(6,1);
        linkedMap.put(1,4);

        System.out.println(hashMap);
        System.out.println(linkedMap);

    }
}
