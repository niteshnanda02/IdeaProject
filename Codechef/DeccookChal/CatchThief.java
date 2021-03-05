package DeccookChal;

import java.util.Scanner;

public class CatchThief {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        if (s.hasNextInt()) {
            int t = s.nextInt();
            while (t-- > 0) {
                long x = s.nextLong(), y = s.nextLong(), k = s.nextLong(), n = s.nextLong();
                long abs=Math.abs(y-x);
                if(abs%(2*k)==0){
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }
        }
    }
}
