package com.company.Bitwise;

public class minFlipToMakeAOrBequaltoC {
    public static int minFlips(int a, int b, int c) {
        int ans=0;
        for(int i=0;i<32;i++){
            int num=1<<i;
            int val=c&num,aval=a&num,bval=b&num;
            if(val==0){
                if(aval!=0)
                    ans++;
                if(bval!=0)
                    ans++;
            }else{
                int sum=aval+bval;
                ans+=2-sum;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minFlips(2,6,5));
    }
}
