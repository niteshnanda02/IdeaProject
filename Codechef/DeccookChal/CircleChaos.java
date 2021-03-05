package DeccookChal;

import java.util.Scanner;

public class CircleChaos {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                long n=s.nextLong();
                int m=s.nextInt();
                int[] p=new int[m];
                for (int i = 0; i <m ; i++) {
                    p[i]=s.nextInt();
                }
                int i=0;
                long kill=0;
                long pos=0;
                while (n!=1){
                    pos=(pos%n+p[i]%n)%n;
                    if(pos==n){
                        i++;
                    }else {
                        n--;
                        kill++;
                    }
                }
                System.out.println(kill);
            }
        }
    }
}
