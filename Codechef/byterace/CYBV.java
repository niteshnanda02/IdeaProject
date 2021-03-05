package byterace;

import java.util.Scanner;

public class CYBV {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                double n=s.nextDouble(),k=s.nextDouble();
                int ans= (int) Math.floor(k/n);
                System.out.println(ans);
            }
        }
    }
}
