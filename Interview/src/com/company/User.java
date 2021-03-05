package com.company;
import java.util.*;
public class User {
    public static void main(String[] args) {
        Menu[] menus=new Menu[5];
        /*
        int i=0;
        while (i<5){

        }*/
        for (int i = 0; i <5 ; i++) {
            menus[i]=new Menu();
        }
        menus[0].addItem("Orange",10);
        menus[1].addItem("Banana",15);
        menus[2].addItem("Watermelon",50);
        menus[3].addItem("Apple",20);
        menus[4].addItem("Grapes",30);
        Scanner s=new Scanner(System.in);
        int totalItems=s.nextInt();
        Items[] items=new Items[totalItems];
        int totalPrice=0;
        for (int i = 0; i <totalItems ; i++) {
            String itemName=s.next();
            int quantity=s.nextInt();
            items[i]=new Items(itemName,quantity);
            int price=find(items[i],menus);
            totalPrice+=price;
        }
        System.out.println(totalPrice);
    }

    private static int find(Items item, Menu[] menus) {
        int price=0;
        for (int i = 0; i <5 ; i++) {
            /*if(menus[i].getItemName().equals(item.getItemName())){
                price=menus[i].getPrice();
                break;
            }*/
        }
        return price*item.getQuantity();
    }
}
/*

        0 1  2

    A=[10,20,40]
             i
    B=[30,40,50]
          j
    10 20 30 40 40 50

    10 20 30

 */