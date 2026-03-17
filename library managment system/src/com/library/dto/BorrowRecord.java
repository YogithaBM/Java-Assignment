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

    public double calculateTotalBorrowValue() {
        double totalBorrowValue = 0;
        for (Book book : books) {
            if (book.getStock() != 0) {
                totalBorrowValue+= book.getPrice();

            }
        }
        return totalBorrowValue;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public void setBorrowCount(int borrowCount) {
        this.borrowCount = borrowCount;
    }
}
