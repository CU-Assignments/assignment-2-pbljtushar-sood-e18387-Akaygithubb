// src/LibraryManagement.java
class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Fiction class inherits Book
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        super.displayDetails();
    }
}

// Non-Fiction class inherits Book
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        // Example usage
        Fiction f = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nf = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        f.displayDetails();
        nf.displayDetails();
    }
}
