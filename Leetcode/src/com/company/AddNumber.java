package com.company;

public class AddNumber {
    public class ListNode {
      int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
    public static void main(String[] args) {


    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c=0;
        String t1="",t2="";
        while(l1!=null&&l2!=null){
            t1+=String.valueOf(l1);
            t2+=String.valueOf(l2);
            l1=l1.next;
            l2=l2.next;
        }
        int ans=Integer.parseInt(t1)+Integer.parseInt(t1);
        String tans=String.valueOf(ans);

        for(int i=tans.length()-1;i>=0;i--){
            l1.val=Integer.parseInt(String.valueOf(tans.charAt(i)));
            l1=l1.next;
        }
        return l1;
    }
}
