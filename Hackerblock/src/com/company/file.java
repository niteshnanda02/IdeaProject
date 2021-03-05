package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class file {
    public static void main(String[] args) {
        String[] names={"doc",
                "doc",
                "image",
                "doc(1)",
                "doc"};
        System.out.println(Arrays.toString(filenaming(names)));
    }
    
    private static String[] filenaming(String[] names) {
//        ArrayList<String > list=new ArrayList<>();
//        for (int i = 0; i <names.length ; i++) {
//            list.add(i,names[i]);
//        }
//        for (int i = 0; i <list.size() ; i++) {
//            int c=0;
//
//            if (i==list.size()-1){
//                break;
//            }
//            for (int j = i+1; j <names.length ; j++) {
//                String a=list.get(i),b=list.get(j);
//                if (list.get(i).equals(list.get(j))) {
//                    c++;
//
//                    list.set(j,list.get(j) + "(" + c + ")");
//                }
//            }
//        }
//        for (int i = 0; i <list.size() ; i++) {
//            names[i]=list.get(i);
//        }
//        System.out.println(list);
//        return names;
        HashMap<String,Integer> map=new HashMap<>();
        for (int i = 0; i <names.length ; i++) {
            if (map.containsKey(names[i])){
                String upd=names[i];
                while (map.containsKey(names[i])){
                    names[i]=names[i]+"("+map.get(names[i])+")";
                    map.put(upd,map.get(upd)+1);
                }
                map.put(names[i],1);
            }else{
                map.put(names[i],1);
            }
        }
        return names;
    }
}
