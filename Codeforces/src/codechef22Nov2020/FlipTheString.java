package codechef22Nov2020;

import java.util.Scanner;

public class FlipTheString {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int t=s.nextInt();
            while (t-->0){
                int ans=0;
                String a=s.next(),b=s.next();
                int i=1;
                int n=a.length();
                while (i<n){
                    boolean temp=false;
                    while (i<n&&a.charAt(i)==b.charAt(i))
                        i+=2;
                    while (i<n&&a.charAt(i)!=b.charAt(i)) {
                        i += 2;
                        temp=true;
                    }
                    if(i<n||temp)
                        ans++;
                }
                i=0;
                while (i<n){
                    boolean temp=false;
                    while (i<n&&a.charAt(i)==b.charAt(i))
                        i+=2;
                    while (i<n&&a.charAt(i)!=b.charAt(i)) {
                        i += 2;
                        temp=true;
                    }
                    if(i<n||temp)
                        ans++;
                }
                System.out.println(ans);
            }
        }
    }
}
