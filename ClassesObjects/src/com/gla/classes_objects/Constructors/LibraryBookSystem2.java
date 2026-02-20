package com.gla.classes_objects.Constructors;

class LibraryBookSystem2 {

    public String ISBN;
    protected String title;
    private String author;

    // Setter method for author
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method for author
    public String getAuthor() {
        return author;
    }
}

// Subclass
class EBook extends LibraryBookSystem2 {

    void display() {
        // Can access public and protected members
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);

        // Cannot access author directly because it is private
        // Must use getter method
        System.out.println("Author: " + getAuthor());
    }

    public static void main(String[] args) {

        EBook ebook = new EBook();

        ebook.ISBN = "978-1234567890";   // public
        ebook.title = "Java Programming"; // protected
        ebook.setAuthor("James Gosling"); // private via setter

        ebook.display();
    }
}
