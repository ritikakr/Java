package com.day6;

import java.util.ArrayList;

class Book 
{
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor to initialize object
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}
//main class
public class BookLibrary 
{
	//main method
    public static void main(String[] args) 
    {
        // Create an ArrayList to store book objects
        ArrayList<Book> books = new ArrayList<>();

        // Create book objects and add them to the ArrayList
        books.add(new Book(1, "The Lord of the Rings", "J.R.R. Tolkien"));
        books.add(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(3, "1984", "George Orwell"));

        // Display all book details using an enhanced for loop
        for (Book book : books) 
        {
            book.displayBookDetails();
        }
    }
}