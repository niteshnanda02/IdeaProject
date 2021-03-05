package com.company.Questions;

import java.util.Scanner;

public class nqtSakshi {
    private class  c{
        @Override
        public String toString() {
            return super.toString();
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        long sum=0;
        while (s.hasNextLine()){
            int n=s.nextInt();
            if(n<17)
                sum+=200;
            else if(n>=17&&n<=40)
                sum+=400;
            else
                sum+=300;
        }
        System.out.println(sum);
    }
}
