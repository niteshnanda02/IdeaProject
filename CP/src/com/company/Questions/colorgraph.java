package com.company.Questions;
import java.util.*;
public class colorgraph {
    public static boolean graphColoring(List<Integer>[] G, int[] color, int i, int C) {
        // Your code here
        if(i==color.length)
            return true;

        for(int c=1;c<=C;c++){
            if(isSafe(G,color,c,i)){
                color[i]=c;
                if(graphColoring(G,color,i+1,C))
                    return true;
                color[i]=0;
            }
        }
        return false;
    }
    static boolean isSafe(List<Integer>[] G, int[] color, int c, int i){
        for(List<Integer> elem:G){
            if(elem.contains(i+1)){
                for(int e:elem){
                    if(e!=i&&c==color[e-1])
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer>[] l=new List[5];

        l[0]=Arrays.asList(new Integer[]{1,2});
        l[1]=Arrays.asList(new Integer[]{2,3});
        l[2]=Arrays.asList(new Integer[]{3,4});
        l[3]=Arrays.asList(new Integer[]{4,1});
        l[4]=Arrays.asList(new Integer[]{1,3});
        int[] color=new int[4];
        System.out.println(graphColoring(l,color,0,3));
    }
}
