//package codevita;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int n=s.nextInt();
//        int d=0,c=0;
//        for (int i = 0; i <n ; i++) {
//            for (int j = 0; j <n ; j++) {
//                char ch=s.next().charAt(0);
//                if(ch=='D')
//                    d++;
//                else
//                    c++;
//            }
//        }
//        int min=Math.max(d,c);
//        int ans= (int) Math.floor(Math.sqrt(min));
//        System.out.println(ans);
//
//
//
//    }
//}
