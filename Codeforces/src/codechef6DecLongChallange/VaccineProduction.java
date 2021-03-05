package codechef6DecLongChallange;

import java.util.Scanner;

public class VaccineProduction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int d1=s.nextInt(),v1=s.nextInt(),d2=s.nextInt(),v2=s.nextInt(),p=s.nextInt();
            int c=0,d=Math.min(d1,d2)-1;
            while (c<p){
                if(d1<d2){
                    c+=v1;
                    d1++;
                }else if(d2<d1){
                    c+=v2;
                    d2++;
                }else {
                    c+=v1;
                    c+=v2;
                    d1++;
                    d2++;
                }
                d++;
            }
            System.out.println(d);
        }
    }
}
