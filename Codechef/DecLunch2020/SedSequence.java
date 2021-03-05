package DecLunch2020;

import java.util.Scanner;

public class SedSequence {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();
                int k=s.nextInt();
                long sum=0;
                for (int i = 0; i <n ; i++) {
                    sum+=s.nextInt();
                }

                if(sum%k==0){
                    System.out.println(0);
                }else
                    System.out.println(1);
            }
        }
    }
}
