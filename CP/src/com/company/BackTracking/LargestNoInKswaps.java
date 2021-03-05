package com.company.BackTracking;

public class LargestNoInKswaps {
    static long num;
    static String ans;

    public static String findMaximumNum(String str, int k) {
        //code here.
        ans = str;
        num = Long.parseLong(ans);

        solve(str.toCharArray(), 0, str.length(), k);

        return ans;
    }

    static void solve(char[] s,int start,int n,int k){
        if(k==0)
            return;
        if(start==n)
            return;
        char max=s[start];
        for(int i=start+1;i<n;i++){
            if(max<s[i])
                max=s[i];
        }
        if(max!=s[start])
            k--;
        for(int i=start;i<n;i++){
            if(max==s[i]){
                swap(s,i,start);
                StringBuilder b=new StringBuilder();
                for(char e: s)
                    b.append(e);
                String res=b.toString();
                if(res.compareTo(ans)>0)
                    ans=res;
                solve(s,start+1,n,k);
                swap(s,i,start);
            }
        }
    }

    static void swap(char[] a, int i, int j) {
        char t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        System.out.println(findMaximumNum("12", 1));
    }
}
