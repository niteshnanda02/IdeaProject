
import java.util.ArrayList;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            boolean val=false;
            ArrayList<Integer> list=new ArrayList<>();
            long n=s.nextInt(),k=s.nextInt();
            if(n==k){
                k++;
                System.out.println(k);
            }
            else if(n>k){
                System.out.println(k);
            }
            else {
                long temp=k/(n-1);
                long rem=k%(n-1);
                if(rem==0){
                    temp=(temp*n)-1;
                }else {
                    temp=(temp*n)+rem;
                }
                System.out.println(temp);
            }
        }
    }
}

