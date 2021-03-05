package com.company;

import java.util.Arrays;
import java.util.List;

public class Tree {
    public static void main(String[] args) {

        String a="eat",b="teb";
        int c=0,d=0;
        for (int i = 0; i <a.length() ; i++) {
            c+=a.charAt(i);
            d+=b.charAt(i);
        }
        if (c==d)
            System.out.println(true);
        else
            System.out.println(false);
    }

}
