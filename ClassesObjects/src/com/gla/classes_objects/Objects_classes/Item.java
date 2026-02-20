package com.gla.classes_objects.Objects_classes;

class Item {

    private String itemCode;
    private String itemName;
    private double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item("I101", "Pen", 10);
        item.displayDetails(5);
    }
}