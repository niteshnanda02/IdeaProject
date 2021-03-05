package com.company;

public class Menu implements MenuIterface,DisplayMenu{

    private String itemName;
    private int price;

    public Menu() {
    }

    @Override
    public void addItem(String itemName, int price) {
        this.itemName=itemName;
        this.price=price;
    }

    @Override
    public void printMenu(Menu[] menus) {
        for (int i = 0; i <menus.length ; i++) {
            System.out.println(menus[i]);
        }
    }

    @Override
    public String toString() {
        return "Menu{" +
                "itemName='" + itemName + '\'' +
                ", price=" + price +
                '}';
    }
}
