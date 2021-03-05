package com.company.NumberTheory.Learning;

public class FastExponentiation {
    private static final int M= (int) (Math.pow(10,6)+7);
    public static void main(String[] args) {
        System.out.println(power(16,20));
        System.out.println(powerwithoutrec(16,20));

    }
    public static int power(int x,int n){
        if (n==0)
            return 1;
        else if (n==1)
            return x;
        else {
            int R=power(x,n/2);
            if (n%2==0)
                return ((R%M)*(R%M))%M;
            else
                return ((R%M)*x*(R%M))%M;
        }
    }
    //codencode
    public static int powerwithoutrec(int x,int n){
        int res=1;
        while (n>0){
            if (n%2!=0) {
                res =(res*x)%M;
                n--;
            }else {
                x=(x*x)%M;
                n/=2;
            }
        }
        return res;
    }
}
