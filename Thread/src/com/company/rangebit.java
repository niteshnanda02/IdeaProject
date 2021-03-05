package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class rangebit {
    public static int rangeBitCount(int a, int b) {
        int c=0;
        for(int i=a;i<=b;i++){
            int j=i;
            while(j>0){
                c=c+(j&1);
                j=j>>1;
            }
        }
        return c;
    }
    static int mirrorBits(int a) {
        int ans=0,pow=1;
        while(a>0){
            int bin=a%2;
            a=a/2;
            ans=ans*pow+bin;
            pow=pow*10;
        }
        return ans;


    }
    static int check(int n,int m){
        if((n&1)==(m&1)){
            return check(n>>1,m>>1);

        }
        System.out.println((~n));
        System.out.println((n+1));
        System.out.println(((~n)&(n+1)));
        return ((~n)&(n+1));
    }
    static int countBlackCells(int n, int m) {
        return n+m+gcd(n,m)-2;
    }
    static int gcd(int i,int j){
        int gcd=1;
        for(int k=1;k<=i&&k<=j;k++){
            if(i%k==0&&j%k==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
        return gcd;
    }

    static int[] firstReverseTry(int[] arr) {
        int s=0;
        int e=arr.length;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return arr;
    }
    static int[] concatenateArrays(int[] a, int[] b) {
        int[] ne=new int[a.length+b.length];
        int l=a.length;
        for(int i=0;i<ne.length;i++){
            if(l>0){
                ne[i]=a[i];
                l--;
            }
            else{
                ne[i]=b[i];
            }
        }
        return ne;
    }
    static boolean isSmooth(int[] arr) {
        int a=arr.length-1;
        if(arr[0]!=arr[a])
            return false;
        if(arr.length%2!=0){
            int mid=a/2;
            if(arr[0]==arr[mid])
                return true;
        }else{
            Double d=new Double(a);
            int m1=(int)Math.floor(d/2);
            int m2=(int)Math.ceil(d/2);
            int b=arr[m1]+arr[m2];
            if(arr[0]==b)
                return true;
        }
        return false;
    }
    static int[] replaceMiddle(int[] arr) {
        int mid=arr.length/2;
        int[] a;
        a=new int[arr.length-1];

        if(arr.length%2==0){
            System.arraycopy(arr,0,a,0,mid-1);
            a[mid-1]=arr[mid-1]+arr[mid];
            System.arraycopy(arr,mid+1,a,mid,a.length-1-(mid-1));

        }else{
            System.arraycopy(arr,0,a,0,mid);
            System.arraycopy(arr,mid+1,a,mid,a.length-1-(mid-1));

        }
        return a;
    }

    static     int makeArrayConsecutive2(int[] statues) {
        int c=0;
        Arrays.sort(statues);
        for(int i=0;i<statues.length-1;i++){
            if(statues[i+1]-statues[i]!=0){
                c++;
            }
        }
        return c;
    }
    static int isSumOfConsecutive2(int n) {
        int c=0,sum=0;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                sum+=j;
                if(sum==n){
                    c++;
                    sum=0;
                }
                if(sum>n){
                    sum=0;
                    break;
                }
            }
        }
        return c;
    }
    static int squareDigitsSequence(int a0) {
        int c=1;
        int n=a0;
        ArrayList<Integer> e=new ArrayList<>();
        e.add(a0);
        return square(n,c,e);

    }

    private static int square(int n, int c,ArrayList<Integer> e) {
        int ans=0;
        while(n>0){
            int a=n%10;
            ans+=(a*a);
            n=n/10;
        }
        if(e.contains(ans)){
            return c+1;
        }else{
            e.add(ans);
            return square(ans,++c,e);
        }
    }
  static int pagesNumberingWithInk(int current, int numberOfDigits) {
        int c=0;
        while(numberOfDigits>0){
            int i=countdigit(current);
            numberOfDigits-=i;

                current++;

        }
        return current-1;
    }
   static int countdigit(int n){
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        return c;
    }
    static int comfortableNumbers(int l, int r) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=l;i<=r;i++){
            int s=sum(l);
            int a=i-s,b=i+s;
            if(l<=a)
                list.add(a);
            if(r>=b)
                list.add(b);
        }
        System.out.println(list);
        return list.size();

    }
    static int sum(int n){
        int r=0;
        while(n>0){
            r+=n%10;
            n/=10;

        }
        return r;
    }
    static int[] weakNumbers(int n) {
        int[] ob=new int[2];
        int max=0,occur=0;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            int x=i;

            while(x>0){
                int k=x-1;
                if(k<x&&divisor(k)>divisor(i)){
                    max++;
                }
                x--;
            }
            list.add(max);
            max=0;
        }
        int maxi=max(list);
        int count=count(list,n);
        ob[0]=maxi;
        ob[1]=count;
        return ob;
    }
    static int max(ArrayList<Integer> n){
        int max=0;
        for(int i=0;i<n.size();i++){
            if(max<n.get(i)){
                max=n.get(i);
            }
        }
        return max;
    }

    static int count(ArrayList<Integer> n,int match){
        int max=0;
        for(int i=0;i<n.size();i++){
            if(match==n.get(i)){
                ++max;
            }
        }
        return max;
    }


    static int divisor(int n){
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0)
                c++;
        }
        return c;
    }
    static int rectangleRotation(int a, int b) {
        int count=0,u=1,l=1;
        for(int i=1;i<=a+1;i++){

            if((a+1)/2==i){
                return 2*u+l;
            }
            u+=2+l;
            l=2+l;

        }
        return u;

    }




    public static void main(String[] args) {
//        System.out.println(rangeBitCount(2,7));
//        System.out.println(mirrorBits(97));
//        System.out.println(check(11,13));
//        System.out.println(countBlackCells(3,4));
        int[] arr={6, 2, 3, 8};
        int[] ar={5,6};
//        firstReverseTry(arr);
//        concatenateArrays(arr,ar);
//        System.out.println(isSmooth(arr));
//        System.out.println(replaceMiddle(arr));
//        System.out.println(makeArrayConsecutive2(arr));
//        System.out.println(isSumOfConsecutive2(9));
//        System.out.println(squareDigitsSequence(16));
//        System.out.println(pagesNumberingWithInk(21,5));
//        System.out.println(comfortableNumbers(1,9));
//        System.out.println(weakNumbers(9));
        System.out.println(rectangleRotation(30,2));
    }

}
