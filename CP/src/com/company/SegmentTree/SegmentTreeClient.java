package com.company.SegmentTree;

import java.util.Arrays;

public class SegmentTreeClient {
    public static void main(String[] args) {
        SegmentTree tree=new SegmentTree();

        //without lazy propagation
        int[] input={0,3,4,2,1,6,-1};
        int[] segmentTree=tree.createSegmentTree(input);

        System.out.println(tree.rangeMinimumQuery(segmentTree,1,6,input.length));
        tree.updateSegmentTree(input,segmentTree,2,1);
        System.out.println(tree.rangeMinimumQuery(segmentTree,1,3,input.length));
        tree.updateSegmentRange(input,segmentTree,3,5,-2);
        System.out.println(tree.rangeMinimumQuery(segmentTree,5,6,input.length));
        System.out.println(tree.rangeMinimumQuery(segmentTree,0,3,input.length));

        //with lazy propagation
        int[] input1={-1,2,4,1,7,1,3,2};
        int[] segmentTree1=tree.createSegmentTree(input1);
        int[] lazy=new int[segmentTree1.length];
        tree.updateSegmentTreeLazy(input1,segmentTree1,lazy,0,3,1);
        tree.updateSegmentTreeLazy(input1,segmentTree1,lazy,0,0,2);
        System.out.println(tree.rangeMinimumQueryLazy(segmentTree1,lazy,3,5,input1.length));
    }
}
