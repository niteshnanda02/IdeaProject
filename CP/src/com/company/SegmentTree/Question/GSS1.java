package com.company.SegmentTree.Question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GSS1 {

    public static class SegmentTree {
        public class Node {
            int sum, pref_sum, suf_sum, res;
            public Node() {
                this.sum = 0;
                this.pref_sum = Short.MIN_VALUE;
                this.suf_sum = Short.MIN_VALUE;
                this.res = Short.MIN_VALUE;
            }
            public Node(int sum, int pref_sum, int suf_sum, int res) {
                this.sum = sum;
                this.pref_sum = pref_sum;
                this.suf_sum = suf_sum;
                 this.res = res;
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
            int mid = (s + e);
            mid=mid>>1;
            constructTree(input, segmentTree, s, mid, 2 * pos + 1);
            constructTree(input, segmentTree, mid + 1, e, 2 * pos + 2);
            segmentTree[pos] = compute(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);
        }
        private Node compute(Node left, Node right) {
            Node parent_node = new Node();
            parent_node.sum = left.sum + right.sum;
            parent_node.pref_sum = Math.max(left.pref_sum, left.sum + right.pref_sum);
            parent_node.suf_sum = Math.max(right.suf_sum, right.sum + left.suf_sum);
            parent_node.res = Math.max(left.res, Math.max(right.res, left.suf_sum + right.pref_sum));
            return parent_node;
        }
        private Node rangeMinimumQuery(Node[] segmentTree, int s, int e, int qs, int qe, int pos) {
            if (s >= qs && e <= qe) {
                return segmentTree[pos];
            }
            if (qs > e || qe < s)
                return new Node();
            int mid = (s + e);
            mid=mid>>1;
            Node left = rangeMinimumQuery(segmentTree, s, mid, qs, qe, 2 * pos + 1);
            Node right = rangeMinimumQuery(segmentTree, mid + 1, e, qs, qe, 2 * pos + 2);
            Node combine = compute(left, right);
            return combine;
        }

        private void update(Node[] segmentTree, int s, int e, int index,int value, int pos) {
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
        PrintWriter out=new PrintWriter(System.out,true);
        FastReader fr = new FastReader();
        int n = fr.nextInt();
        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = fr.nextInt();
        }
        SegmentTree tree = new SegmentTree();
        SegmentTree.Node[] segmentTree = tree.constructTree(input);
        int m = fr.nextInt();
        for (int i = 0; i < m; i++) {
            int c=fr.nextInt();
            if(c==0){
                int index=fr.nextInt();
                index--;
                int v=fr.nextInt();
                tree.update(segmentTree,0,n-1,index,v,0);            }
            if(c==1) {
                int qs = fr.nextInt() - 1;
                int qe = fr.nextInt() - 1;
                long ans = tree.rangeMinimumQuery(segmentTree,0,n-1,qs,qe,0).res;
                out.println(ans);
            }
        }
    }
}
class FastReader {
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new
                InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }
}