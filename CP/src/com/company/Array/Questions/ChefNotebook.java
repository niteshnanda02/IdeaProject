package com.company.Array.Questions;

import java.util.Scanner;

public class ChefNotebook {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-->0){
                int x=s.nextInt(),y=s.nextInt(),k=s.nextInt(),n=s.nextInt();
                int left_page=x-y;
                if (left_page<=0){
                    System.out.println("LuckyChef");
                    continue;
                }
                boolean flag=false;
                for (int i = 0; i <n ; i++) {
                    int p=s.nextInt(),c=s.nextInt();
                    if(p>=left_page&&c<=k){
                        flag=true;
                    }
                }
                if (flag)
                    System.out.println("LuckyChef");
                else
                    System.out.println("UnluckyChef");

            }
        }
    }
}
