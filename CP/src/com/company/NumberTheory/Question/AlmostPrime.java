package com.company.NumberTheory.Question;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlmostPrime {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());
        int res=0;
        for (int i = 2; i <=n ; i++) {
            if (check(i))
                res++;
        }
        System.out.println(res);
    }
    private static boolean check(int n){
        int cnt=0;
        for (int i = 2; i*i <=n ; i++) {
            if(n%i==0){
                cnt++;
                while (n%i==0)
                    n=n/i;
            }
        }
        if(n>1)
            cnt++;
        return cnt==2;
    }
}
