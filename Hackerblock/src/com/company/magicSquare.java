package com.company;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class magicSquare {
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        int t=s.nextInt();
//        while (t>0){
//            int n=s.nextInt();
//            int[][] arr=new int[n][n];
//            magic(arr);
//            t--;
//        }
        int[] arr={1,1,1,1};
//        int p=239;
//        System.out.println(minimalNumberOfCoins(arr,p));
//        System.out.println(Arrays.toString(switchLights(arr)));
//        System.out.println(electionsWinners(arr,1));
        int[] a={0, -1, 0, -1, 0, -1};
        int[] b={3,4,6};
//        System.out.println(areSimilar(a,b));
//        System.out.println(adaNumber("16#123abc#"));
//        System.out.println(1/10);
//        System.out.println(1%10);
//        System.out.println(threesplit(a));

//        String c="z";
//        check(c);
//        System.out.println(c);

//        System.out.println(Arrays.toString(newNumeralSystem('G')));
//        System.out.println(cipher26("taiaiaertkixquxjnfxxdh"));
//        System.out.println(stolenLunch("you'll n4v4r 6u4ss 8t: cdja"));
//        System.out.println(higherVersion("1.0.5","1.1.0"));
//        System.out.println(decipher("10197115121"));
        int[][] ar={{1,2},
        {0,2},
        {1,1},
        {0,1},
        {1,2},
        {0,1}};
//        System.out.println(pairOfShoes(ar));
        System.out.println(combs("*...*","*.*"));
    }
    static int combs(String comb1, String comb2) {
        int c=0;
        char ch1='/',ch2='/';
        for(int i=0,j=0;i<comb1.length()||j<comb2.length();){
            if(i>=comb1.length()){
                ch1='/';
            }else {
                ch1=comb1.charAt(i);

            }
            if(j>=comb2.length()){
                ch2='/';
            }else {
                ch2=comb2.charAt(j);

            }
            if(ch2=='*'&&j==0){
                c++;
                j++;
                continue;
            }else{
                if((ch1=='*'&&ch2=='.')||(ch1=='.'&&ch2=='*')){
                    c++;
                    i++;
                    j++;
                    continue;
                }else if(ch1=='*'||ch1=='.'){
                    c++;
                    i++;
                    continue;
                }else{
                    c++;
                    j++;
                }


            }
        }
        return c;

    }

    static boolean pairOfShoes(int[][] shoes) {
        if(shoes.length%2!=0){
            return false;
        }
        ArrayList<ArrayList<Integer>> finlist=new ArrayList<>();
        for(int i=0;i<shoes.length;i++){
            ArrayList<Integer> list=new ArrayList<>();
            list.add(shoes[i][0]);
            list.add(shoes[i][1]);
            finlist.add(list);
        }
        System.out.println(finlist.size());
        int c=0;
        for(int i=0;i<finlist.size();i++){
            int x=finlist.get(i).get(0);
            int y=finlist.get(i).get(1);
            for(int j=i+1;j<finlist.size();j++){
                if(x!=finlist.get(j).get(0)&&y==finlist.get(j).get(1)){
                    c++;
                    finlist.remove(j);
                    break;
                }
            }
        }
        System.out.print(c);
        if(c==shoes.length/2){
            return true;
        }else{
            return false;
        }



    }


    static String decipher(String cipher) {
        int c=0;
        String ans="";
        for(int i=1;i<=cipher.length();i++){
            String ch=cipher.substring(c,i);
            int check=Integer.parseInt(ch);
            char a=(char)check;
            if(a>='a'&&a<='z'){
                ans+=a;
                c=i;
            }
        }
        return ans;
    }

    static boolean higherVersion(String ver1, String ver2) {

            boolean flag=false;
            String[] v1=ver1.split("[.]+");
            String[] v2=ver2.split("[.]+");
            int[] a1=Arrays.stream(v1).mapToInt(Integer::parseInt).toArray();
            int[] a2=Arrays.stream(v2).mapToInt(Integer::parseInt).toArray();
            int c=0;
            for (int i = 0; i <a1.length; i++) {
                if(a1[i]>a2[i]){
                    return true;
                }else if(a1[i]<a2[i]){
                    return false;
                }


            }
            return false;

    }



    static String stolenLunch(String note) {
        boolean flag=false;
        StringBuilder builder=new StringBuilder(note);
        for(int i=0;i<builder.length();i++){
            char ch=builder.charAt(i);
            if(ch==':'){
                flag=true;
            }
            if(ch>=48&&ch<=57){
                int ans=ch-'0'+'a';

                builder.setCharAt(i,(char)ans);
            }
            if(flag){
                if(ch>='a'&&ch<='z'){
                    int ans=ch-'1';

                    builder.setCharAt(i,(char)(ans));
                }

            }
        }
        return builder.toString();

    }

    static String cipher26(String message) {
        int prev=0;
        StringBuilder builder=new StringBuilder(message);
        for(int i=0;i<message.length();i++){
            if(i>0){
                prev=message.charAt(i-1)-'a';
            }
            int curr=message.charAt(i)-'a';
            curr=((curr+26-prev)%26);
            int ans=curr+'a';
            char c=(char)(ans);
            builder.setCharAt(i,c);

        }
        return builder.toString();
    }

    static String[] newNumeralSystem(char number) {
        int num=number-'A';
        ArrayList<String> list=new ArrayList<>();
        for(char i='A';i<='Z';i++){

            for(char j=i;j<='Z';j++){
                int l=(i-'A')+(j-'A');
                char s=(char) l;
                if(l==num){
                    list.add(String.valueOf(i)+" + "+String.valueOf(j));

                }
            }
        }
        String[] ans=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            ans[i]=list.get(i);
        }
        return ans;
    }


    private static void check(String c) {
        StringBuilder builder=new StringBuilder(c);
        int ans=('z'-builder.charAt(0))+97;

        builder.setCharAt(0,(char)ans);
        System.out.println(builder);
    }


    private static int threesplit(int[] a) {
        int sum=Arrays.stream(a).sum();
        int ch1=0,c=0;

        sum/=3;
        for (int i = 0; i <a.length-1 ; i++) {
            ch1+=a[i];
            if (ch1==sum){
                int ch2=0;
                for (int j = i+1; j <a.length ; j++) {
                    ch2 += a[j];
                    if (ch2 == sum) {
                        c++;
                    }

                }
            }

        }

        return c;
    }

    static boolean adaNumber(String line) {
        boolean flag=false;
        if(line.charAt(line.length()-1)=='#'){
            int i=0;
            int basechar=0;
            while(line.charAt(i)!='#'&&basechar<=16){
                if(line.charAt(i)!='_'){
                    if(line.charAt(i)>=0&&line.charAt(i)<=9){
                        basechar=basechar*10+(line.charAt(i)-'0');
                    }else{
                        return false;
                    }
                }
                i++;
            }
            if(basechar<2||basechar>16){
                return false;
            }
            i++;
            while(i<line.length()-1){
                if(line.charAt(i)!='_'){
                    int digit=-1;
                    if(line.charAt(i)>='a'&&line.charAt(i)<='f'){
                        digit=line.charAt(i)-'a'+10;
                    }
                    if(line.charAt(i)>='A'&&line.charAt(i)<='F'){
                        digit=line.charAt(i)-'A'+10;
                    }
                    if(line.charAt(i)>='0'&&line.charAt(i)<='9'){
                        digit=line.charAt(i)-'0';
                    }
                    if(digit>=0&&digit<basechar){
                        flag=true;
                    }else{
                        return false;
                    }
                }
                i++;
            }
        }else{
            for(int i=0;i<line.length();i++){
                if(line.charAt(i)!='_'){
                    if(line.charAt(i)>='0'&&line.charAt(i)<='9'){
                        flag=true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return flag;
    }

    static boolean areSimilar(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }

    static int electionsWinners(int[] votes, int k) {
        int max=m(votes);
        int c=0;
        for(int i=0;i<votes.length;i++){

            if(votes[i]==max){
                for(int j=0;j<votes.length;j++){
                    if(votes[j]!=max){
                        int a=votes[j];
                        int b=(k/(votes.length-1));
                        int check=votes[j]+(k/(votes.length-1));
                        if(check>max){
                            c++;
                        }
                    }
                }
            }
            else{
                int check=votes[i]+k;
                if(check>max){
                    c++;
                }
            }


        }
        int ch=occ(votes,max);
        if(ch==1){
            c++;
        }

        return c;
    }
    static int occ(int[] arr,int val){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                c++;
            }
        }
        return c;
    }
    static int m(int[] votes){
        int max=0;
        for(int i=0;i<votes.length;i++){
            if(max<votes[i]){
                max=votes[i];
            }
        }
        return max;
    }

    static int[] switchLights(int[] a) {

        for(int i=0;i<a.length;i++){
            if(a[i]==1){
                int j=i;
                while(j>=0){
                    if(a[j]==0)
                        a[j]=1;
                    else{
                        a[j]=0;
                    }
                    j--;

                }
            }
        }
        return a;

    }
    static void replace(int[] arr,int j){

    }

    static int minimalNumberOfCoins(int[] coins, int price) {
        int c=0;
        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=price){
                int qu=price/coins[i];
                int rem=price%coins[i];
                c+=qu;
                price=rem;
            }

        }
        if (price!=0){
            c+=price*coins[0];
        }
        return c;
    }

    private static void magic(int[][] arr) {
        int c=0;
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <3 ; j++) {
                if (i==arr.length/2&&j==arr.length/2){
                    if (arr[i][j]==5){
                        continue;
                    }
                }

                if (i%2==0&&j%2==0){
                    if (arr[i][j]%2==0){
                        continue;
                    }
                }
                else  {
                    if (arr[i][j]%2!=0){
                        continue;
                    }
                }

                if (arr[i][j]!=5){
                    c++;
                }else {
                    if (i%2==0||j%2==0){
                        c+=2;
                    }else {
                        c++;
                    }
                }

            }
        }
        System.out.println(c);
    }
}
