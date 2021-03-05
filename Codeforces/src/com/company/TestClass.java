package com.company;
import java.io.*;
import java.util.*;

class TestClass {
    static Map<Character,Integer>[] map;
    public static void main(String args[] ) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        String[] inp = br.readLine().split(" ");
        int N = Integer.parseInt(inp[0]);
        int M = Integer.parseInt(inp[1]);
        String[] S = new String[N];
        map=new HashMap[M];
        for(int i=0;i<M;i++){
            map[i]=new HashMap<>();
        }
        for(int i=0;i<N;i++)
        {
            S[i] = br.readLine();
            for(int j=0;j<M;j++){
                if(map[j].containsKey(S[i].charAt(j))){
                    map[j].put(S[i].charAt(j), map[j].get(S[i].charAt(j))+1);
                }else{
                    map[j].put(S[i].charAt(j),1);

                }
            }
        }
        int Q = Integer.parseInt(br.readLine().trim());
        String[] quries = new String[Q];
        for(int i=0;i<Q;i++)
        {
            quries[i] = br.readLine();
        }
        int[] out_ = solve(N, M, Q, S, quries);
        System.out.print(out_[0]);
        for(int i_out_ = 1; i_out_ < out_.length; i_out_++)
        {
            System.out.print(" " + out_[i_out_]);
        }

        System.out.println();
        wr.close();
        br.close();
    }
    static int[] solve(int N, int M, int Q, String[] S, String[] quries) {
        //Your code goes here
        int[] ans=new int[Q];
        for(int i=0;i<quries.length;i++){
            int co=0;
            int b=0;
            for(int j=0;j<quries[i].length();j++){
                char c=quries[i].charAt(j);
                int v=0;
                if(c!='?'){
                    if(map[j].containsKey(c)){
                        v=map[j].get(c);
                    }
                    if(co==0&&v!=0){
                        co=v;
                    }
                    if(v<co){
                        co=v;
                    }
                }else{
                    b++;
                }
            }
            if(b==M){
                co=M;
            }
            ans[i]=co;
        }
        return ans;
    }
}