//package com.company.Questions;
//
//import java.util.LinkedList;
//
//public class c1 {
//
//    public LinkedList<Integer> mergeTwoLists(LinkedList<Integer> l1, LinkedList<Integer> l2) {
//        if(l1==null)return l2;
//        if(l2==null)return l1;
//        if(l1.val<l2.){
//            l1.next=mergeTwoLists(l1.next,l2);
//            return l1;
//        }else{
//            l2.next=mergeTwoLists(l1,l2.next);
//            return l2;
//        }
//    }
//}
