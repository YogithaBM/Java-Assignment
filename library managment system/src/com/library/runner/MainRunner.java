package com.library.runner;

import com.library.dto.*;
import com.library.service.LibraryService;

import static com.library.service.LibraryService.LIBRARY_NAME;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println(LIBRARY_NAME);

        Book book1 = new Book(2343, "Percy Jackson", "Rick Riordan", 453.47D, 2, BookCategory.FICTION);
        Book book2 = new Book(23, "Java", "James Gosling", 564.4D, 1, BookCategory.TECHNOLOGY);
        Book book3 = new Book(34, "Physics intro ", "Newton", 365.7D, 2, BookCategory.SCIENCE);
        Book book4 = new Book(65, "World History", "Herodotus", 7854.44D, 1, BookCategory.HISTORY);
        Book book5 = new Book(89, "Wings of Fire", "A.P.J.Abdul Kalam", 5623.32D, 4, BookCategory.NONFICTION);
        Book[] books = {book1, book2, book3, book4, book5};

        Member member = new Member(7535, "Caleb", "caleb@gmail.com", MembershipType.STUDENT);
        BorrowRecord record = new BorrowRecord(345, member, books, 3);
        LibraryService libraryService = new LibraryService();
        libraryService.printBookDetails(book1);
        System.out.println("  ");
        libraryService.printMemberDetails(member);
        System.out.println("  ");
        libraryService.printBorrowRecordDetails(record);
        System.out.println("  ");
        libraryService.calculateLibraryValue(books);
        System.out.println("  ");
        libraryService.findLowStockBooks(books);
        

    }
}
