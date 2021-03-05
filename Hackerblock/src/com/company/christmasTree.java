package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class christmasTree {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(christmasTree(8, 5)));
    }

    private static String[] christmasTree(int levelNum, int levelHeight) {
        ArrayList<String> list=new ArrayList<>();
        int star = 1,actstar=5;
        int space = levelHeight + levelNum,actspa=levelHeight+levelNum-1;
        for (int k = 0; k < levelNum; k++) {
            for (int i = -1; i < levelHeight + 2; i++) {
                String add="";
                if(k>0&&i>(levelHeight-2)){
                    continue;
                }
                if (i == -1&&k==0) {
                    for (int j = 0; j < space; j++) {
                        add+=" ";
                    }
                    add+="*";
                    list.add(add);
                    continue;
                }
                for (int j = 0; j < space; j++) {
                    add+=" ";
                }
                space--;
                for (int j = 0; j < star; j++) {
                    add+="*";
                }
                star += 2;
                list.add(add);
            }
            actstar+=2;
            star=actstar;
            if(k<1){
                actspa-=2;
                space=actspa;
            }else{
                actspa-=1;
                space=actspa;
            }

        }

        int len=list.get(list.size()-1).length();
        if(len%2==0){
            len=(len/2);
        }else{
            len=(len/2)-1;
        }
        System.out.println("len"+len);
        String spa="",sta="";
        int stlen=0;
        if (levelHeight%2==0){
            for (int i = 0; i <levelHeight+1 ; i++) {
                sta+="*";
            }

            stlen=(sta.length()/2)-1;
            len-=stlen;
            for (int i = 0; i <len ; i++) {
                spa+=" ";
            }

        }else {
            for (int i = 0; i <levelHeight ; i++) {
                sta+="*";
            }
            for (int i = 0; i <len ; i++) {
                spa+=" ";
            }

        }
        System.out.println("stlen"+stlen);
        System.out.println("splen"+len);

        for (int i = 0; i <levelNum ; i++) {
            list.add(spa+sta);
        }
        String[] res=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            res[i]=list.get(i);
        }

        return res;
    }


}
