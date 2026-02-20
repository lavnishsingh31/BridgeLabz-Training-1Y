package com.gla.classes_objects.Objects_classes;

class Employee2 {

    private String name;
    private int id;
    private double salary;

    // Constructor
    Employee2(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee2 emp = new Employee2("Rahul", 101, 50000);
        emp.displayDetails();
    }
}
