package com.company;

import java.util.Random;

public class java {
    public static void main(String[] args) {
        Random random=new Random();
        for (int i = 1; i <=7 ; i++) {
            System.out.println(random.nextInt(7));

        }
    }
}
