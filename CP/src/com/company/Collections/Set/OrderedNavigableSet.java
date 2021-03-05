package com.company.Collections.Set;
import java.util.*;
public class OrderedNavigableSet {
    public static void main(String[] args) {

        NavigableSet<Integer> navigableSet=new TreeSet<>();
        navigableSet.add(4);
        navigableSet.add(6);
        navigableSet.add(1);
        navigableSet.add(5);
        navigableSet.add(2);
        System.out.println(navigableSet);
        //order_of_key
        System.out.println(navigableSet.headSet(25).size());
        //find_by_order
        System.out.println(navigableSet.toArray()[4]);
    }
}
