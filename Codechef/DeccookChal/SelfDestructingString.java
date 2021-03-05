package DeccookChal;

import java.util.Scanner;

public class SelfDestructingString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if (s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                String str=s.next();
                int n=str.length();
                int zero=0,one=0;
                for (int i = 0; i <n ; i++) {
                    char ch=str.charAt(i);
                    if(ch=='0')
                        zero++;
                    else
                        one++;
                }

                int diff=Math.abs(zero-one);
                if(diff%2!=0||diff==n)
                    System.out.println(-1);
                else {
                    System.out.println((diff/2));
                }
            }

        }

    }
}
