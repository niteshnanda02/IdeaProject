package codechef28NOV2020;

import java.util.Scanner;

public class GasoLineIntro {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int n=s.nextInt();
                int[] a=new int[n+1];
                for (int i = 1; i <n+1 ; i++) {
                    a[i]=s.nextInt();
                }
                int start=a[1];
                for(int i=2;i<n+1;i++){
                    if(start>=(i-1)){
                        start+=a[i];
                    }else {
                        break;
                    }
                }
                System.out.println(start);
            }
        }
    }
}
