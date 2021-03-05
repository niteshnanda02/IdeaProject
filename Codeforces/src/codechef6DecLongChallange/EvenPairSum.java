package codechef6DecLongChallange;

import java.util.Scanner;

public class EvenPairSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                long a=s.nextLong(),b=s.nextLong();
                long odda,oddb,evena,evenb;
                if(a%2==0){
                    odda = a/2;
                    evena=a/2;
                }else{
                    odda=(a/2)+1;
                    evena=a/2;
                }

                if(b%2==0){
                    oddb = b/2;
                    evenb=b/2;
                }else{
                    oddb=(b/2)+1;
                    evenb=b/2;
                }

                System.out.println(((evena*evenb)+(odda*oddb)));
            }
        }
    }
}
