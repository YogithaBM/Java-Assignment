package com.library.runner;

import com.library.book.Book;
import com.library.book.Genre;
import com.library.book.Shelf;
import com.library.user.Login;
import com.library.user.Member;
import com.library.user.Registration;

public class MainRunner {
    public static void main(String[] args) {
        Book book = new Book();
        book.displayBook("Alex", "the Fury");
        System.out.println("   ");
        Genre genre=new Genre();
        System.out.println("   ");
        genre.displayGenre("Psychological","English");
        Shelf shelf =new Shelf();
        shelf.displayShelf(4,"UK");
        System.out.println("   ");

        Member member=new Member();
        member.displayMember("Sandy",354323);
        System.out.println("   ");
        Login login=new Login();
        login.displayLogin("SandyMandy",345234);
        System.out.println("   ");
        Registration registration=new Registration();
        registration.registerUser("Sandy32@gmail.com",4576467139L);




    }
}
