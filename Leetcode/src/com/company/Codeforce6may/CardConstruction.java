
import java.util.ArrayList;
import java.util.Scanner;

public class CardConstruction {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        while (t-->0){
            int n=s.nextInt();
            ArrayList<Integer> list=new ArrayList<>();
            int val=0;
            int c=1;
            while (val<=n){
                val=c*(3*c+1)/2;
                if(val<=n){
                    list.add(val);
                }
                c++;
            }
            int ans=0;
            for (int i = list.size()-1; i >=0 ; ) {
                if (n<2)
                    break;
                if(list.get(i)<=n){
                    ans++;
                    n-=list.get(i);
                }else
                    i--;
            }
            System.out.println(ans);
        }
    }
}
