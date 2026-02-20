package com.gla.classes_objects.Constructors;

class LibraryBookSystem {

    String title;
    String author;
    double price;
    boolean availability;

    // Constructor
    LibraryBookSystem(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true; // book available by default
    }

    // Method to borrow book
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book details
    void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        LibraryBookSystem book1 = new LibraryBookSystem("Java Programming", "James Gosling", 599);

        book1.displayBookDetails();

        book1.borrowBook();  // First borrow attempt
        book1.borrowBook();  // Second borrow attempt

        book1.displayBookDetails();
    }
}