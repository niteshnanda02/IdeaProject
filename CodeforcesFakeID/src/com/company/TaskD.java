package com.company;

import java.util.*;

public class TaskD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            List<Long> a=new ArrayList<>();
            for (int i = 0; i < n; i++) {
                a.add(s.nextLong());
            }
            Collections.sort(a,Collections.reverseOrder());
            long alice=0,bob=0;
            for (int i = 0; i <n ; i++) {
                if (i%2==0){
                    if(a.get(i)%2==0)
                        alice+=a.get(i);
                }else{
                    if(a.get(i)%2!=0)
                        bob+=a.get(i);
                }
            }
            if(alice>bob){
                System.out.println("Alice");
            }else if(alice<bob){
                System.out.println("Bob");
            }else {
                System.out.println("Tie");
            }

        }
    }
}
