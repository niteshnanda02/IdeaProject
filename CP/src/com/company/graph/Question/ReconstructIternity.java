package com.company.graph.Question;

import java.util.*;

public class ReconstructIternity {
    public static List<String> findItinerary(List<List<String>> tickets) {
        int n=tickets.size();
        Map<String,PriorityQueue<String>> adj=new HashMap<>(n);
        List<String> ans=new ArrayList<>();
        //make a graph
        for (int i = 0; i<n ; i++) {
            String src=tickets.get(i).get(0),dst=tickets.get(i).get(1);
            PriorityQueue<String> queue=new PriorityQueue<>();
            if(adj.containsKey(src)){
                queue=adj.get(src);
            }
            queue.add(dst);
            adj.put(src,queue);
        }
        Stack<String> stack=new Stack<>();
        stack.push("JFK");
        while (!stack.isEmpty()){
            String src=stack.peek();
            if(!adj.containsKey(src)||adj.get(src).size()==0){ //No further traverse possible
                ans.add(src);
                stack.pop();
            }else {
                String dst=adj.get(src).peek();
                stack.push(dst);
                adj.get(src).remove(dst);
            }
        }
        Collections.reverse(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        List<List<String>> tickets=new ArrayList<>(n);

        for (int i = 0; i <n ; i++) {
            String a=s.next(),b=s.next();
            List<String> l=new ArrayList<>();
            l.add(a);
            l.add(b);
            tickets.add(l);
        }
        System.out.println(tickets);
        System.out.println(findItinerary(tickets));
    }
}
