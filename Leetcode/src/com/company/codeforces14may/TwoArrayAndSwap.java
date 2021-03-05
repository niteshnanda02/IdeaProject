
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TwoArrayAndSwap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            int k=s.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for (int i = 0; i <a.length ; i++) {
                a[i]=s.nextInt();
            }
            for (int i = 0; i <a.length ; i++) {
                b[i]=s.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i=0,j=n-1;
            while (k>0){
                if(i>=n||j<0)
                    break;
                if(a[i]<b[j]){
                    int te=a[i];
                    a[i]=b[j];
                    b[j]=te;
                    i++;
                    j--;
                    k--;
                }else {
                    break;
                }
            }
            int ans=0;
            for (int l = 0; l <n ; l++) {
                    ans+=a[l];
            }
            System.out.println(ans);
        }
    }
}
