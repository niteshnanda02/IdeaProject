package codes;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Arrays;

public class InversionPair {
    long inv_count=0;
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        testNumber=in.nextInt();
        while (testNumber-->0){
        inv_count=0;
            int n=in.nextInt();
        long[] a=in.nextLongArray(n);
        mergeSort(a,0,n-1);
        out.println(inv_count);
    }
    }

    private long[] mergeSort(long[] a, int l, int h) {
        if(l==h){
            long[] br=new long[1];
            br[0]=a[l];
            return br;
        }
        int mid=(l+h)/2;
        long[] fh=mergeSort(a,l,mid);
        long[] sh=mergeSort(a,mid+1,h);
        long[] merge=merge(fh,sh);
        return merge;
    }

    private long[] merge(long[] a, long[] b) {
        long[] merge=new long[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length&&j<b.length){
            if(a[i]<=b[j])
                merge[k++]=a[i++];
            else {
                inv_count+=a.length-(i);
                merge[k++] = b[j++];
            }
        }
        while (i<a.length){
            merge[k++]=a[i++];
        }
        while (j<b.length){
            merge[k++]=b[j++];
        }
        return merge;
    }
}
