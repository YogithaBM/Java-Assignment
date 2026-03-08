package com.library.book;

public class Genre {
    private void genreType(String genreName){
        System.out.println("Genre : "+genreName);
    }
    private void checkLanguage(String language){
        System.out.println("Language : "+language);

    }
    public void displayGenre(String genreName,String language){
        genreType(genreName);
        checkLanguage(language);


    }
}
