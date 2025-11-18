package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;
public class BookTest {
    Book book1, book2;
    public void setUp() {   
        book1 = new Book("The Great Gatsby", "Fiction", 10.99, 180);
        book2 = new Book("To Kill a Mockingbird", "Fiction", 12.99, 281,
                new BookAuthor("Harper Lee", 1926, "American novelist widely known for To Kill a Mockingbird."),
                new BookAuthor("John Doe", 1970, "Fiction writer and essayist."));
    }
    public void testToString() {
        System.out.println("Testing Book 1:");
        System.out.println(book1.toString());
        System.out.println("Testing Book 2:");
        System.out.println(book2.toString());
    }    
    public static void main(String[] args) {
        BookTest test = new BookTest();
        test.setUp();
        test.testToString();
    }
}
