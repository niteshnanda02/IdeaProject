package com.company.Questions;

public class vivek1 {
    public static void main(String[] args) {
        String[] a={"234","673","246","896","357","249","584"};
        processInput(15,a);
    }

    private static void processInput(int inputInt, String[] inputArray) {
        int fine=350;
        int res=0;
        for(int i=0;i<inputArray.length;i++){
            if(inputInt%2==0){
                if(Integer.parseInt(inputArray[i])%2!=0)
                    res++;
            }else{

                if(Integer.parseInt(inputArray[i])%2==0)
                    res++;
            }
        }

        System.out.println((res*fine));
    }
}
