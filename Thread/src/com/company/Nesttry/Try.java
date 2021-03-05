package com.company.Nesttry;

public class Try {
    public static void main(String[] args) {
        for(String str : args) {
            System.out.println(str);
        }
        try {
            int a=args.length;
            int b=42/a;
            System.out.println("a = "+a);
            try {
                if(a==1)
                    a=a/(a-a);
                if(a==2){
                    int c[]={1};
                    c[42]=99;
                }
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index out of bound");
            }
        }catch (ArithmeticException e){
            System.out.println("Divide by zero :"+e);
        }
    }

}
