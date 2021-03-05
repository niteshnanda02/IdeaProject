package com.company;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class check {
    public static class SegmentTree {
        public class Node {
            long sum;
            long pref_sum;
            long suf_sum;
            long res;

            public Node() {
                this.sum = 0;
                this.pref_sum = Integer.MIN_VALUE;
                this.suf_sum = Integer.MIN_VALUE;
                res = Integer.MIN_VALUE;
            }

            @Override
            public String toString() {
                return "Node{" +
                        "sum=" + sum +
                        ", pref_sum=" + pref_sum +
                        ", suf_sum=" + suf_sum +
                        ", res=" + res +
                        '}';
            }
        }

        public Node[] constructTree(int[] input) {
            Node[] segmentTree = new Node[4 * input.length + 1];
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

            int mid = (s + e) / 2;
            constructTree(input, segmentTree, s, mid, 2 * pos + 1);
            constructTree(input, segmentTree, mid + 1, e, 2 * pos + 2);
            segmentTree[pos] = compute(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);
        }

        private Node compute(Node left, Node right) {

            //change the combine function according to the question
            //Example -max,min,sum
            //if T changes this will change
            Node parent_node = new Node();
            parent_node.sum = left.sum + right.sum;
            parent_node.pref_sum = Math.max(left.pref_sum, left.sum + right.pref_sum);
            parent_node.suf_sum = Math.max(right.suf_sum, right.sum + left.suf_sum);
            parent_node.res = Math.max(left.res, Math.max(right.res, left.suf_sum + right.pref_sum));
            return parent_node;
        }

        public Node rangeMinimumQuery(Node[] segmentTree, int qs, int qe, int len) {
            return rangeMinimumQuery(segmentTree, 0, len - 1, qs, qe, 0);
        }

        private Node rangeMinimumQuery(Node[] segmentTree, int s, int e, int qs, int qe, int pos) {

            //overlap
            if (s >= qs && e <= qe) {
                return segmentTree[pos];
            }
            //no overlap
            if (qs > e || qe < s)
                return new Node();

            //partial
            int mid = (s + e) / 2;
            Node left = rangeMinimumQuery(segmentTree, s, mid, qs, qe, 2 * pos + 1);
            Node right = rangeMinimumQuery(segmentTree, mid + 1, e, qs, qe, 2 * pos + 2);
            Node combine = compute(left, right);
            return combine;
        }
    }

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n = in.nextInt();
        int[] a = in.nextIntArray(n);
        SegmentTree tree = new SegmentTree();
        SegmentTree.Node[] segmentTree = tree.constructTree(a);
        int m = in.nextInt();
        for (int i = 0; i < m; i++) {
            int qs = in.nextInt();
            int qe = in.nextInt();
            qs--;
            qe--;
            long ans = tree.rangeMinimumQuery(segmentTree, qs, qe, n).res;
            out.println(ans);
        }
    }
}