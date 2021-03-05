
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class RobotPath {
    public static void main(String[] args) {
        Scanner s=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t=s.nextInt();
        for (int i = 1; i <=t ; i++) {
            String str=s.next();
            long N=0,W=0,E=0,S=0,w=1,h=1;
            long num=1;
            Stack<Integer> stack=new Stack<>();
            for (int j = 0; j <str.length() ; j++) {
                switch (str.charAt(j)){
                    case '(':
                        break;
                    case ')':
                        num=num/stack.peek();
                        stack.pop();
                        break;
                    case 'N':
                        N+=num;
                        break;
                    case 'E':
                        E+=num;
                        break;
                    case 'W':
                        W+=num;
                        break;
                    case 'S':
                        S+=num;
                        break;
                    default:
                        num*=str.charAt(j)-'0';
                        stack.push(str.charAt(j)-'0');
                        break;
                }
            }
            long horiz=E-W;
            long vert=S-N;
            if(horiz<0){
                w=1000000000+horiz+1;
            }else {
                w=horiz+1;
            }

            if(vert<0){
                h=1000000000+vert+1;
            }else {
                h=vert+1;
            }
            System.out.println("Case #"+i+": "+w+" "+h);
        }
    }

}
