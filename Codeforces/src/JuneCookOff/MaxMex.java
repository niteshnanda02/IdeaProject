package JuneCookOff;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxMex {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt(),m=s.nextInt();
                long[] a=new long[n];
                long[] hash=new long[m+1];
                int mcount=0;
                for (int i = 0; i <n ; i++) {
                    a[i]=s.nextLong();
                    if (a[i]==m){
                        mcount++;
                    }
                    if (a[i]<m){
                        hash[(int) a[i]]++;
                    }
                }
                hash[0]=1;
                boolean fl=false;
                for (int i = 0; i <m ; i++) {
                    if (hash[i]==0){
                        fl=true;
                        break;
                    }
                }
                if (fl)
                    System.out.println("-1");
                else {
                    System.out.println(n-mcount);
                }
            }
        }
    }
}
