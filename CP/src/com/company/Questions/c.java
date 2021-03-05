package com.company.Questions;


import java.util.*;

public class c {
    static int maxLen(int arr[], int n) {
        // Your code here
        Arrays.sort(arr);
        int i = 0;
        for (i = 0; i < n; i++) {
            if (arr[i] >= 0)
                break;

        }
        int val = arr[i];
        int l = i - 1, h = i + 1;
        int c = 1;
        int max = 0;
        while (l >= 0 && h < n) {
            if (val > 0) {
                val += arr[l];
                l--;
                c++;
            }
            if (val == 0) {
                max = Math.max(c, max);
            }
            if(val<0){
                val += arr[h];
                h++;
                c++;
            }
            if (val == 0) {
                max = Math.max(c, max);
            }

        }
        return c;
    }

    public static void main (String[] args)
    {
        //code
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        List<Character> l=new ArrayList<>();
        while(t-->0){
            String st=s.next();
            l.clear();
            int max=0;
            for(int i=0;i<st.length();i++){
                char ch=st.charAt(i);
                if(l.contains(ch)){

                    int ind=find(l,ch);
                    while (ind>=0){
                        l.remove(0);
                        ind--;
                    }
                }
                l.add(ch);

                max=Math.max(max,l.size());
            }

            System.out.println(max);
        }
    }

    private static int find(List<Character> l, char ch) {
        for (int i = l.size()-1; i >=0 ; i--) {
            if(l.get(i)==ch)
                return i;
        }
        return 0;
    }
}