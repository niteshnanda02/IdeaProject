package com.company.BinarySearch;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

class TestClass {
    public static void main(String args[]) throws Exception {

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Write your code here
        int n = Integer.parseInt(br.readLine());
        String l = br.readLine();
        String[] a = l.split(" ");
        int[] inp = new int[n];
        for (int i = 0; i < n; i++) {
            inp[i] = Integer.parseInt(a[i]);
        }
        Arrays.sort(inp);
        int q = Integer.parseInt(br.readLine());
        for (int i = 0; i < q; i++) {
            int p = Integer.parseInt(br.readLine());
            getpower(inp, n, p);
        }

    }




    private static void getpower(int[] inp,int n,int p){
        int[] arr=prefix(inp,n);
        int ans=0;
        int ind = 0;
        if (inp[n - 1] < p)
            ans = n;
        else if (p < inp[0]) {
            System.out.println("0 0");
            return;
        } else {
            ans = binary(inp, 0, n - 1, p, n);
        }
        ind=ans-1;

        System.out.println(inp[ind]+" "+arr[ind]);
    }
    private static int[] prefix(int[] inp,int n){
        int[] arr=new int[n];
        arr[0]=inp[0];
        for(int i=1;i<n;i++){
            arr[i]=inp[i]+arr[i-1];
        }
        return arr;
    }
    private static int binary(int[] inp,int l,int h,int item,int n){
        if(inp[n-1]<=item)
            return n-1;
        while (l<=h){
            int mid=l+(h-l)/2;
            if(inp[mid]<=item)
                l=mid+1;
            else
                h=mid-1;
        }
        return l;
    }
}
