package com.gla.classes_objects.Constructors;

class Vehicle {
    String ownerName;
    String vehicleType;
    static double registrationFee = 5000;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void displayVehicleDetails() {
        System.out.println(ownerName + " | " + vehicleType +
                " | Fee: " + registrationFee);
    }

    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Arjun", "Car");
        v.displayVehicleDetails();

        Vehicle.updateRegistrationFee(6000);
        v.displayVehicleDetails();
    }
}
