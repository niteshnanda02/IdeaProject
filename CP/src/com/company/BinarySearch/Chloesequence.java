package com.company.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Chloesequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String l=reader.readLine();
        String[] a=l.split(" ");
        long n=Long.parseLong(a[0]);
        long k=Long.parseLong(a[1]);
//        System.out.println(Long.numberOfTrailingZeros(k)+1);
        if(k%2!=0)
            System.out.println(1);
        else {
            long val=binarysearch(n,k,1, (long) (Math.pow(2,n)-1));
            System.out.println(val);
        }
    }

    private static long binarysearch(long n, long k, long l, long r) {
        long mid=(l+r)>>1;
        if(mid==k)
            return n;
        else if(k>mid){
            return binarysearch(n-1,k,mid+1,r);
        }else
            return binarysearch(n-1,k,l,mid-1);
    }
}
