package com.company;

import java.util.Scanner;

public class Model {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        long[][] a=new long[n][m];
        List<Long> list=new ArrayList<>();
        for(int i=0;i<n;i++){

            for(int j=0;j<m;j++){
                a[i][j]=s.nextLong();
            }
        }

        for(int i=0;i<n;i++){
            long res=0;
            for(int j=0;j<m;j++){
                res+=a[i][j];
            }
            list.add(res);
        }
        for(int i=0;i<m;i++){
            long res=0;
            for(int j=0;j<n;j++){
                res+=a[j][i];
            }
            list.add(res);
        }

        Collections.sort(list);
        System.out.println(list);
        long q=s.nextLong();

        for(long i=0;i<q;i++){
            long l=s.nextLong(),r=s.nextLong();
            long lindex=lower(list,0,list.size()-1,l);
            long rindex=upper(list,0,list.size()-1,r);
            System.out.println(lindex+" "+rindex);
            long res=rindex-lindex;
            System.out.print(res+" ");
        }
    }
    static long lower(List<Long> li,long l,long h,long data){
        long an=0;
        while(l<=h){
            int mid=(int)(l+(h-l)/2);
            if(li.get(mid)==data){
                an=mid;
                break;
            }else if(li.get(mid)>data)
                h=mid-1;
            else{
                l=mid+1;
                an=mid;
            }
        }
        return an;
    }
    static long upper(List<Long> li,long l,long h,long data){
        long an=0;
        while(l<=h){
            int mid=(int)(l+(h-l)/2);
            if(li.get(mid)==data){
                an=mid;
                break;
            }else  if(li.get(mid)>data){
                h=mid-1;
                an=mid;
            }
            else
                l=mid+1;
        }
        return an;
    }
}
