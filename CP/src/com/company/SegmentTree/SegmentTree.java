package com.company.SegmentTree;

import java.util.Arrays;

public class SegmentTree {

    public int[] createSegmentTree(int[] input) {
        int[] segmentTree = new int[4 * input.length + 1];
        Arrays.fill(segmentTree, Integer.MAX_VALUE);
        constructMinSegmentTree(segmentTree, input, 0, input.length - 1, 0);
        return segmentTree;
    }

    private void constructMinSegmentTree(int[] segmentTree, int[] input, int s, int e, int pos) {
        if (s == e) {
            segmentTree[pos] = input[s];
            return;
        }
        int mid = (s + e) / 2;
        constructMinSegmentTree(segmentTree, input, s, mid, 2 * pos + 1);
        constructMinSegmentTree(segmentTree, input, mid + 1, e, 2 * pos + 2);
        segmentTree[pos] = Math.min(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);
    }

    public int rangeMinimumQuery(int[] segmentTree, int qs, int qe, int len) {
        return rangeMinimumQuery(segmentTree, 0, len - 1, qs, qe, 0);
    }

    private int rangeMinimumQuery(int[] segmentTree, int s, int e, int qs, int qe, int pos) {

        //3Cases
        //1. No overlap
        if (qe < s || qs > e)
            return Integer.MAX_VALUE;

        //2. Complete Overlap
        if (s >= qs && e <= qe)
            return segmentTree[pos];

        //3. Partial Overlap

        int mid = (s + e) / 2;
        int left = rangeMinimumQuery(segmentTree, s, mid, qs, qe, 2 * pos + 1);
        int right = rangeMinimumQuery(segmentTree, mid + 1, e, qs, qe, 2 * pos + 2);
        return Math.min(left, right);
    }

    public void updateSegmentTree(int[] input, int[] segmentTree, int index, int value) {
        input[index] += value;
        updateSegmentTree(segmentTree, index, value, 0, input.length - 1, 0);
    }

    private void updateSegmentTree(int[] segmentTree, int index, int value, int s, int e, int pos) {

        //non overlap
        if (index < s || index > e)
            return;

        if (s == e) {
            segmentTree[pos] += value;
            return;
        }

        int mid = (s + e) / 2;

        updateSegmentTree(segmentTree, index, value, s, mid, 2 * pos + 1);
        updateSegmentTree(segmentTree, index, value, mid + 1, e, 2 * pos + 2);
        int left = segmentTree[2 * pos + 1];
        int right = segmentTree[2 * pos + 2];
        segmentTree[pos] = Math.min(left, right);
    }

    public void updateSegmentRange(int[] input, int[] segmentTree, int qs, int qe, int value) {
        for (int i = qs; i <= qe; i++) {
            input[i] += value;
        }
        updateSegmentRange(segmentTree, 0, input.length - 1, qs, qe, value, 0);
    }

    private void updateSegmentRange(int[] segmentTree, int s, int e, int qs, int qe, int value, int pos) {

        if (qs > e || qe < s)
            return;

        if (s == e) {
            segmentTree[pos] += value;
            return;
        }

        int mid = (s + e) / 2;
        updateSegmentRange(segmentTree, s, mid, qs, qe, value, 2 * pos + 1);
        updateSegmentRange(segmentTree, mid + 1, e, qs, qe, value, 2 * pos + 2);
        int left = segmentTree[2 * pos + 1];
        int right = segmentTree[2 * pos + 2];
        segmentTree[pos] = Math.min(left, right);
    }

    public void updateSegmentTreeLazy(int[] input, int[] segmentTree, int[] lazy, int qs, int qe, int value) {
        updateSegmentTreeLazy(segmentTree, lazy, qs, qe, value, 0, input.length - 1, 0);
    }

    private void updateSegmentTreeLazy(int[] segmentTree, int[] lazy, int qs, int qe, int value, int s, int e, int pos) {

        if (s > e)
            return;

        //make sure all propagation is done at pos. If not update tree
        //at pos and mark its children for lazy propagation
        if (lazy[pos] != 0) {
            segmentTree[pos] += lazy[pos];
            if (s != e) {
                lazy[2 * pos + 1] = lazy[pos];
                lazy[2 * pos + 2] = lazy[pos];
            }
            lazy[pos] = 0;
        }

        //no overlap condition
        if (qs > e || qe < s)
            return;

        //complete overlap
        if (s >= qs && e <= qe) {
            segmentTree[pos] += value;
            if (s != e) {
                lazy[2 * pos + 1] = lazy[pos];
                lazy[2 * pos + 2] = lazy[pos];
            }
            return;
        }

        //partial overlap
        int mid = (s + e) / 2;
        updateSegmentTreeLazy(segmentTree, lazy, qs, qe, value, s, mid, 2 * pos + 1);
        updateSegmentTreeLazy(segmentTree, lazy, qs, qe, value, mid+1, e, 2 * pos + 2);
        segmentTree[pos] = Math.min(segmentTree[2 * pos + 1], segmentTree[2 * pos + 2]);
    }

    public int rangeMinimumQueryLazy(int[] segmentTree, int[] lazy, int qs, int qe, int len) {
        return rangeMinimumQueryLazy(segmentTree, lazy, qs, qe, 0, len - 1, 0);
    }

    private int rangeMinimumQueryLazy(int[] segmentTree, int[] lazy, int qs, int qe, int s, int e, int pos) {

        if (s > e)
            return Integer.MAX_VALUE;
        //make sure all propagation is done at pos. If not update tree
        //at pos and mark its children for lazy propagation

        if (lazy[pos] != 0) {
            segmentTree[pos] += lazy[pos];
            if (s != e) {
                lazy[2 * pos + 1] = lazy[pos];
                lazy[2 * pos + 2] = lazy[pos];
            }
            lazy[pos] = 0;
        }
        //No overlap
        if (qs > e || qe < s)
            return Integer.MAX_VALUE;

        //complete overlap
        if (s >= qs && e <= qe) {
            return segmentTree[pos];
        }

        //partial overlap
        int mid = (s + e) / 2;
        int left = rangeMinimumQueryLazy(segmentTree, lazy, qs, qe, s, mid, 2 * pos + 1);
        int right = rangeMinimumQueryLazy(segmentTree, lazy, qs, qe, mid + 1, e, 2 * pos + 2);
        return Math.min(left, right);
    }
}
