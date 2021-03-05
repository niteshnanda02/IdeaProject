package com.company.greedy;

public class SmallestNumber {
    static String smallestNumber(int S, int D){
        // code here
        StringBuilder ans=new StringBuilder();
        int sum=1;
        ans.append("1");
        for(int i=1;i<D;i++)
            ans.append("0");
        for(int i=D-1;i>=0;i--){
            char ch=ans.charAt(i);
            int val=ch-'0';
            while(val<9){
                if(sum<S){
                    sum++;
                    val++;
                    ans.setCharAt(i,(char) (val+'0'));
                }else{
                    break;
                }
            }

        }
        if(sum==S){
            return ans.toString();
        }else{
            return "-1";
        }
    }

    public static void main(String[] args) {
        System.out.println(smallestNumber(6,6));
    }
}
