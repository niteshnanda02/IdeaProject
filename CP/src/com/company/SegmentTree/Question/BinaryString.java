package com.company.SegmentTree.Question;

import java.util.Arrays;

public class BinaryString {

    public static class Solution {
        public class Tree {
            private class Node {
                int l, r;
                long z, t;

                Node() {
                    l = 0;
                    r = 0;
                    z = 0;
                    t = 0;
                }

                Node(int a, int b, long c, long d) {
                    l = a;
                    r = b;
                    z = c;
                    t = d;
                }

                @Override
                public String toString() {
                    return "Node{" +
                            "l=" + l +
                            ", r=" + r +
                            ", z=" + z +
                            ", t=" + t +
                            '}';
                }
            }

            public Node[] construct(char[] inp) {
                Node[] tree = new Node[4 * inp.length + 1];
                for (int i = 0; i < tree.length; i++) {
                    tree[i] = new Node();
                }
                construct(inp, tree, 0, inp.length - 1, 0);
                return tree;
            }

            private void construct(char[] inp, Node[] tree, int s, int e, int pos) {
                if (s == e) {
                    char ch = inp[s];
                    if (ch == '1') {
                        tree[pos].l = 1;
                        tree[pos].r = 1;
                        tree[pos].z = 0;
                        tree[pos].t = 0;
                    } else {
                        tree[pos].l = 0;
                        tree[pos].r = 0;
                        tree[pos].z = 0;
                        tree[pos].t = 1;
                    }
                    return;
                }

                int mid = s + (e - s) / 2;
                construct(inp, tree, s, mid, 2 * pos + 1);
                construct(inp, tree, mid + 1, e, 2 * pos + 2);
                tree[pos] = comp(tree[2 * pos + 1], tree[2 * pos + 2]);
            }

            private Node comp(Node left, Node right) {
                Node parent = new Node();
                parent.l = left.l == 1 ? left.l : right.l;
                parent.r = right.r == 1 ? right.r : left.r;
                if (left.l == 1)
                    parent.t = left.t + right.t;
                else
                    parent.t = right.t;
                if (left.l == 1 && right.r == 1)
                    parent.z = parent.t;
                else
                    parent.z = 0;

                return parent;
            }

            private Node range(Node[] tree, int s, int e, int qs, int qe, int pos) {
                if (s >= qs && e <= qe) {
                    return tree[pos];
                } else if (qs > e || qe < s)
                    return new Node();

                int mid = s + (e - s) / 2;
                Node left = range(tree, s, mid, qs, qe, 2 * pos + 1);
                Node right = range(tree, mid + 1, e, qs, qe, 2 * pos + 2);
                Node c = comp(left, right);
                return c;
            }
        }

        public int[] solve(String A, int[][] B) {
            int[] ans = new int[B.length];
            Tree tree = new Tree();
            Tree.Node[] sgtree = tree.construct(A.toCharArray());
            for (int i = 0; i < B.length; i++) {
                int l = B[i][0];
                int r = B[i][1];

                l--;
                r--;
                long a = tree.range(sgtree, 0, A.length() - 1, l, r, 0).z;
                ans[i] = (int) a;
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solve("0100010010", new int[][]{{1, 8}, {3, 7}})));
    }
}
