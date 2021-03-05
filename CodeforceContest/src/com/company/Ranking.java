
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ranking {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        while (t>0){
            t--;
            int n=s.nextInt();
            int x=s.nextInt();
            int[] arr=new int[n];
            for (int i = 0; i <n ; i++) {
                arr[i]=s.nextInt();
            }
            int a=check(arr,n,x);
            System.out.println(a);
        }
    }

    private static int check(int[] arr, int n, int x) {
        Arrays.sort(arr);
        if (x<arr[0]){
            return 1;
        }
        int v=arr[0];
        if (v>1){
            x-=v;
        }
        if (x<0){
            return v;
        }
        if (x==0)
            return v+1;
        for (int i = 1; i <n ; i++) {
            int val=arr[i]-arr[i-1];
            if (val>1){
                if (x>val-1){
                    x-=val-1;
                }else {
                    return arr[i];
                }
            }
        }
        return arr[n-1]+1;
    }
}
