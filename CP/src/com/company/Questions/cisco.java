package com.company.Questions;
import java.util.*;
public class cisco {
    static class j implements Comparable<j>{
        int s,f,p;

        public j(int s, int f, int p) {
            this.s = s;
            this.f = f;
            this.p = p;
        }

        @Override
        public int compareTo(j j) {
            return this.s-j.s;
        }
    }
    static int fs(List<j> j){
        int s=0;
        for(int i=0;i<j.size();i++)
            s+=j.get(i).p;
        return s;
    }
    static List<Integer> fm(List<j> j){
        Collections.sort(j);

        List<List<j>> l=new ArrayList<>(j.size());
        for (int i = 0; i <j.size() ; i++) {
            l.add(new ArrayList<>());
        }
        l.get(0).add(j.get(0));

        for (int i = 1; i <j.size() ; i++) {
            for (int k = 0; k <i ; k++) {
                if((j.get(k).f<=j.get(i).s)&&(fs(l.get(k))>fs(l.get(i))))
                    l.set(i,l.get(k));
            }
            l.get(i).add(j.get(i));
        }
        List<j> mc=new ArrayList<>();
        for (int i = 0; i <l.size() ; i++) {
            if(fs(l.get(i))>fs(mc))
                mc=l.get(i);
        }
        List<Integer> list=new ArrayList<>();
        int a=0;
        int sum=0,red=0;
        for (int i = 0; i <j.size() ; i++) {
            sum+=j.get(i).p;
        }
        for (int i = 0; i <mc.size() ; i++) {
            red+=mc.get(i).p;
        }
        list.add(j.size()-mc.size());
        list.add(sum-red);

        return list;

    }
    private static List<Integer> func(List<String> start_time,List<String> end_time,List<Integer> fees){
        List<j> j=new ArrayList<>();
        for (int i = 0; i <start_time.size() ; i++) {
            j.add(new j(Integer.parseInt(start_time.get(i)),Integer.parseInt(end_time.get(i)),fees.get(i)));
        }
        return fm(j);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        List<String> start_time=new ArrayList<>();

        List<String> end_time=new ArrayList<>();

        List<Integer> fees=new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            start_time.add(s.next());
            end_time.add(s.next());
            fees.add(s.nextInt());
        }

        System.out.println(func(start_time,end_time,fees));
    }
}
