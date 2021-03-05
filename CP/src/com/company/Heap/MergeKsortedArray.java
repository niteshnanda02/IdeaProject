package com.company.Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKsortedArray {
    static class node implements Comparable<node>{
        int val,row,col;
        node(int a,int b,int c){
            val=a;
            row=b;
            col=c;
        }

        @Override
        public int compareTo(node node) {
            return this.val-node.val;
        }
    }
    public static ArrayList<Integer> mergeKArrays(int[][] arrays, int k)
    {
        // Write your code here.
        ArrayList<Integer> list=new ArrayList<>();
        PriorityQueue<node> queue=new PriorityQueue<>();
        int i=0,j=0,m=arrays[0].length;

        for(;i<k;i++){
            queue.add(new node(arrays[i][j],i,j));
        }
        while(!queue.isEmpty()){
            node rv=queue.remove();
            list.add(rv.val);
            if(rv.col<m-1){
                queue.add(new node(arrays[rv.row][rv.col+1],rv.row,rv.col+111));
            }
        }
        return list;

    }

    public static void main(String[] args) {
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println(mergeKArrays(a,3));
    }
}
