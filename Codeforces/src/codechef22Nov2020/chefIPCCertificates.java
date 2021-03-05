package codechef22Nov2020;

import java.util.Scanner;

public class chefIPCCertificates {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        if(s.hasNextInt()){
            int n=s.nextInt(),m=s.nextInt(),k=s.nextInt();
            int ans=0;
            for (int i = 0; i <n ; i++) {
                int c=0;
                for (int j = 0; j <k ; j++) {
                    c+=s.nextInt();
                }
                int q=s.nextInt();
                if(q<=10&&c>=m)
                    ans++;
            }
            System.out.println(ans);
        }
    }
}
