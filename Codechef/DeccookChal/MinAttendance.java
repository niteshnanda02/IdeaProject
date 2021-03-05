package DeccookChal;

import java.util.Scanner;

public class MinAttendance {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();
                String str=s.next();
                double pres=0;
                for (int i = 0; i <n ; i++) {
                    char ch=str.charAt(i);
                    if(ch=='1')
                        pres++;
                }
                double rem=120-n;
                double qual=((rem+pres)/120.0)*100;
                if (qual>=75){
                    System.out.println("YES");
                }else
                    System.out.println("NO");
            }
        }
    }
}
