package com.company.Questions;

import java.util.*;

public class medianInStream {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            PriorityQueue<Integer> maxLeft = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer integer, Integer t1) {
                    return t1 - integer;
                }
            });
            PriorityQueue<Integer> minRight = new PriorityQueue<>();
            int median = 0;
            for (int i = 0; i < n; i++) {
                int val = s.nextInt();
                if (i == 0) {
                    maxLeft.add(val);
                    median = val;
                    System.out.print(median);

                    continue;
                }
                if(maxLeft.size()>minRight.size()){
                    if(val<median){
                        int rv=maxLeft.poll();
                        maxLeft.add(val);
                        minRight.add(rv);
                    }else {
                        minRight.add(val);
                    }
                    median=(maxLeft.peek()+minRight.peek())/2;
                }else if(maxLeft.size()<minRight.size()){
                    if (val<median){
                        maxLeft.add(val);
                    }else {
                        int rv=minRight.poll();
                        minRight.add(val);
                        maxLeft.add(rv);
                    }
                    median=(maxLeft.peek()+minRight.peek())/2;
                }else {
                    if (val<median){
                        maxLeft.add(val);
                        median=maxLeft.peek();
                    }else {
                        minRight.add(val);
                        median=minRight.peek();
                    }
                }
                System.out.println(median);
            }
        }
}
