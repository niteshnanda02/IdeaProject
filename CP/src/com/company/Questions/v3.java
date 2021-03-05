package com.company.Questions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class v3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String S = br.readLine();

            int out_ = solve(S);
            System.out.println(out_);
        }

        wr.close();
        br.close();
    }
    static int solve(String S){
        // Write your code here

        int A=0,C=0,Q=0;
        int ans=0;
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            if(ch=='A'){

                A++;
                Q=0;
            }
            else if(ch=='C'){
                C++;
                Q=0;
            }
            else{
                Q++;
                int curr=0;
                if(A>C){
                    A=A-C;
                    C=0;
                    curr=A;
                }else{
                    C=C-A;
                    A=0;
                    curr=C;
                }
                curr+=Q;
                ans=Math.max(curr,ans);
            }
        }
        ans=Math.max(A,ans);
        ans=Math.max(C,ans);
        return ans;
    }
}

