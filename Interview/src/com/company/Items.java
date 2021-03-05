package com.company;

public class Items {
    private String itemName;
    private int quantity;

    public Items() {
    }

    public Items(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setItem(String name){
        this.itemName=name;
    }
}
