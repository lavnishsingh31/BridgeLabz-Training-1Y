package com.gla.classes_objects.Objects_classes;

class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (quantity >= qty)
            quantity -= qty;
        else
            System.out.println("Not enough quantity to remove!");
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + getTotalCost());
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 50000, 1);
        item.addItem(1);
        item.displayCart();
    }
}
