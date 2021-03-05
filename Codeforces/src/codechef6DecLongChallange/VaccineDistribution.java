package codechef6DecLongChallange;

import java.util.*;

public class VaccineDistribution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int old=0,list=0;
                int n=s.nextInt(),d=s.nextInt();
                for (int i = 0; i <n ; i++) {
                    int v=s.nextInt();
                    if(v<=9||v>=80)
                        old++;
                    else
                        list++;
                }
                long ans=0;
                if(old%d!=0)
                    ans++;
                ans+=old/d;
                if(list%d!=0)
                    ans++;
                ans+=list/d;
                System.out.println(ans);
            }
        }
    }
}
