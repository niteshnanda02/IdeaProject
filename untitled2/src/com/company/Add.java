package com.company;

public class Add implements addInterface{
    @Override
    public void add(int a, int b) {
        int sum=a+b;
        System.out.println(sum);
    }
}
