
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfinitePrefix {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int n=s.nextInt();
            int x=s.nextInt();
            String S=s.next();
            System.out.println(check(S,x,n));
        }
    }

    private static int check(String s, int x, int n) {
        String a=s;
        int ans=0;
        boolean flag=true;

        if (count(a)==x){
            return -1;
        }
        while (flag){
            List<String> pref=prefix(a);
            int c=0;
            for (int i = 0; i <pref.size() ; i++) {
                if (count(pref.get(i))==x){
                    c++;
                }
            }
            if (c>0){
                flag=false;
                ans=c;
            }else {
                a=a.concat(a);
            }

        }

        return ans;
    }
    static List<String> prefix(String s){
        List<String> list=new ArrayList<>();
            int i=0;
            for (int j = i; j <=s.length() ; j++) {
                String a=s.substring(i,j);
                    list.add(a);
        }
        return list;
    }
    static int count(String s){
        int z=0,o=0;
        for (int i = 0; i <s.length() ; i++) {
            if (Integer.parseInt(String.valueOf(s.charAt(i)))==1){
                o++;
            }else if (Integer.parseInt(String.valueOf(s.charAt(i)))==0){
                z++;
            }
        }
        return Math.abs(z-o);
    }
}
