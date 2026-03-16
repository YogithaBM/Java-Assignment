package com.library.dto;

public class BorrowRecord {
    private int recordId;
    private Member member;
    private Book[] books;
    private int borrowCount;

    public BorrowRecord(int recordId, Member member, Book[] books, int borrowCount) {
        this.recordId = recordId;
        this.member = member;
        this.books = books;
        this.borrowCount = borrowCount;
    }

}
