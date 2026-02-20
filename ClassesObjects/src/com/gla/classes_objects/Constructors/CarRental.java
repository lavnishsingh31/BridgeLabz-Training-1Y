package com.gla.classes_objects.Constructors;

class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static double costPerDay = 1000;

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    void display() {
        System.out.println(customerName + " | " + carModel +
                " | Total Cost: " + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental c = new CarRental("Ravi", "Honda City", 3);
        c.display();
    }
}
