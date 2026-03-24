package com.library.service;
import com.library.dto.Book;
import com.library.dto.BorrowRecord;
import com.library.dto.Member;

public class LibraryService {
    public static final String LIBRARY_NAME = "City Central Library";

    public void printBookDetails(Book book){
        if (book!=null){
            System.out.println("ID : "+book.getBookId());
            System.out.println("Title : "+book.getTitle());
            System.out.println("Author : "+book.getAuthor());
            System.out.println(("Price : "+book.getPrice()));
            System.out.println(("Stock : "+book.getStock()));
            System.out.println("Category : "+book.getCategory());
        }
        else System.out.println("passed a null value,plzz pass a proper value");
    }

    public void printMemberDetails(Member member){
        if (member!=null) {
            System.out.println("ID : "+member.getMemberId());
            System.out.println("Name : "+member.getName());
            System.out.println("Email : "+member.getEmail());
            System.out.println("Membership Type : "+member.getMembershipType());
        }
        else System.out.println("pass a proper value");
    }

    public void printBorrowRecordDetails(BorrowRecord record){
        System.out.println("Member name : "+record.getMember().getName());
        System.out.println("Book list");
        for (Book book:record.getBooks()){
            System.out.println(book.getTitle());
        }

        System.out.println("Total Borrow Value : "+record.calculateTotalBorrowValue());
    }
    public double calculateLibraryValue(Book[] books) {
        double totalStockValue = 0;
        for (Book book : books) {
            totalStockValue += book.calculateStockValue();
        }
        return totalStockValue;

    }
    public void findLowStockBooks(Book[] books){
        for (Book book:books){
            System.out.println("Title : "+book.getTitle());
            System.out.println("Stock : "+book.getStock());
        }

    }


}

