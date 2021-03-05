package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class sumofodd {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        ArrayList<String> list=new ArrayList<>();
        while (t>0){
            t--;
            int n=s.nextInt(),k=s.nextInt();
            if(n%k==0)
                list.add("YES");
            else
                list.add("NO");

        }
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
