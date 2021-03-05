
import java.util.Scanner;

public class UnstableArray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            long n=s.nextLong();
            long m=s.nextLong();

            if(n==1){
                System.out.println(0);
            }else if(n==2){
                System.out.println(m);
            }else {
                long temp=m/(n/2);
                long laseEI=m%(n/2)+temp;
                long res=(temp*(n/2-1))*2+laseEI*2;
                System.out.println(res);
            }
        }
    }
}
