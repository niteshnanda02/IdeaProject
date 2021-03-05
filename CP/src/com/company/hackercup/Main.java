package com.company.hackercup;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader("/home/nitesh/Downloads/travel_restrictions_input.txt"));

        PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("/home/nitesh/Desktop/output.txt")));
        int t=Integer.parseInt(reader.readLine());
        for (int l = 1; l <=t ; l++) {
            int n=Integer.parseInt(reader.readLine());
            String I=reader.readLine();
            String O=reader.readLine();
            char[][] a=new char[n][n];
            for (char[] b:a
            ) {
                Arrays.fill(b,'N');
            }
            for (int i = 0; i <n ; i++) {
                int j=i;
                a[i][j]='Y';
                int Il=i-1,Ol=j;
                int Ir=i+1,Or=j;
                int L=Il,R=Ir;
                while (Il>=0){
                    char up=I.charAt(Il);
                    char low=O.charAt(Ol);
                    if(low=='N'||up=='N')
                        break;
                    else{
                        a[i][L]='Y';
                        Il--;
                        Ol--;
                        L--;
                    }
                }
                while (Ir<n){
                    char up=I.charAt(Ir);
                    char low=O.charAt(Or);
                    if(low=='N'||up=='N')
                        break;
                    else{
                        a[i][R]='Y';
                        Ir++;
                        Or++;
                        R++;
                    }
                }
            }
            pw.write("Case #"+l+":\n");
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    pw.write(a[i][j]);
                }
                pw.write("\n");
            }

        }


        pw.flush();
    }
}
