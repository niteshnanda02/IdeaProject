package com.company.SegmentTree.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class KGGS {
    public static class SegmentTree {
        public static class Node {
            int sum, pref_sum, suf_sum, res;
            public Node() {
                this.sum = 0;
                this.pref_sum = 0;
                this.suf_sum = 0;
                this.res = 0;
            }
            public Node(int sum, int pref_sum, int suf_sum, int res) {
                this.sum = sum;
                this.pref_sum = pref_sum;
                this.suf_sum = suf_sum;
                this.res = res;
            }
        }
        public Node[] constructTree(int[] input) {
            Node[] segmentTree = new SegmentTree.Node[4 * input.length + 1];
            for (int i = 0; i < segmentTree.length; i++) {
                segmentTree[i] = new Node();
            }
            constructTree(input, segmentTree, 0, input.length - 1, 0);
            return segmentTree;
        }
        private void constructTree(int[] input, Node[] segmentTree, int s, int e, int pos) {
            if (s == e) {
                segmentTree[pos].sum = input[s];
                segmentTree[pos].pref_sum = input[s];
                segmentTree[pos].suf_sum = input[s];
                segmentTree[pos].res = input[s];
                return;
            }
            int mid = (s + e);
            mid=mid>>1;
            constructTree(input, segmentTree, s, mid, 2 * pos + 1);
            constructTree(input, segmentTree, mid + 1, e, 2 * pos + 2);
            segmentTree[pos] = compute(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);
        }
        private Node compute(Node left, Node right) {
            Node parent_node = new KGGS.SegmentTree.Node();
            parent_node.sum = left.sum + right.sum;
            parent_node.pref_sum = Math.max(left.pref_sum,  right.pref_sum);
            parent_node.suf_sum = Math.max(right.suf_sum,  left.suf_sum);
            parent_node.res = Math.max(left.res, Math.max(right.res, left.suf_sum + right.pref_sum));
            return parent_node;
        }
        private Node rangeMinimumQuery(Node[] segmentTree, int s, int e, int qs, int qe, int pos) {
            if (s >= qs && e <= qe) {
                return segmentTree[pos];
            }
            if (qs > e || qe < s)
                return new KGGS.SegmentTree.Node();
            int mid = (s + e);
            mid=mid>>1;
            Node left = rangeMinimumQuery(segmentTree, s, mid, qs, qe, 2 * pos + 1);
            Node right = rangeMinimumQuery(segmentTree, mid + 1, e, qs, qe, 2 * pos + 2);
            Node combine = compute(left, right);
            return combine;
        }

        private void update(Node[] segmentTree, int s, int e, int index, int value, int pos) {
            if(index<s||index>e)
                return;
            if(s==e){
                segmentTree[pos]=new Node(value,value,value,value);
                return;
            }
            int mid=(s+e);
            mid=mid>>1;
            update(segmentTree,s,mid,index,value,2*pos+1);
            update(segmentTree,mid+1,e,index,value,2*pos+2);
            segmentTree[pos]=compute(segmentTree[2*pos+1],segmentTree[2*pos+2]);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String l = reader.readLine();
        String[] a = l.split(" ");
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(a[i]);
        }
        SegmentTree tree = new SegmentTree();
        SegmentTree.Node[] segmentTree = tree.constructTree(input);
        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            l = reader.readLine();
            a = l.split(" ");
            char ch = a[0].charAt(0);
            if (ch == 'Q') {
                int qs = Integer.parseInt(a[1]) - 1;
                int qe = Integer.parseInt(a[2]) - 1;
                System.out.println(tree.rangeMinimumQuery(segmentTree,0,n-1,qs,qe,0).res);
            } else if (ch == 'U') {
                int ind = Integer.parseInt(a[1]) - 1;
                int val = Integer.parseInt(a[2]);
                tree.update(segmentTree,0,n-1,ind,val,0);
            }
        }
    }
}
