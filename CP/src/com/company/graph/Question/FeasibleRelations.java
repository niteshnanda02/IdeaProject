package com.company.graph.Question;
import java.util.*;
public class FeasibleRelations {


    private static class pair{
        int f,s;
        pair(int a,int b){
            f=a;
            s=b;
        }
    }
    static ArrayList<ArrayList<Integer>> adj;
    static int[] vis,cc;
    static int curr_count;
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/

        //Scanner
        Scanner s = new Scanner(System.in);
        int t=s.nextInt();
        while(t-->0){
            curr_count=0;
            ArrayList<pair> list=new ArrayList<>();
            int n=s.nextInt(),k=s.nextInt();
            adj=new ArrayList<>(n+1);
            vis=new int[n+1];
            cc=new int[n+1];
            for(int i=0;i<n+1;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<k;i++){
                int a=s.nextInt();
                String str=s.next();
                int b=s.nextInt();
                if(str.equals("=")){
                    adj.get(a).add(b);
                    adj.get(b).add(a);
                }else{
                    list.add(new pair(a,b));
                }
            }
            for(int i=0;i<n+1;i++){
                if(vis[i]==0){
                    curr_count++;
                    dfs(i);
                }
            }
            boolean flag=true;
            for(int i=0;i<list.size();i++){
                int a=list.get(i).f, b=list.get(i).s;
                if(cc[a]==cc[b]){
                    flag=false;
                    break;
                }
            }
            if(flag)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
    private static void dfs(int node){
        vis[node]=1;
        cc[node]=curr_count;
        for(int c:adj.get(node)){
            if(vis[c]==0)
                dfs(c);
        }
    }

}
