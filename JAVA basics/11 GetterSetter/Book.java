public class Book {

    private int bookId;
    private String title;
    private String author;
    private String publisher;
    private double price;
    private int pages;
    private String genre;
    private int edition;
    private String language;

    public int getBookId(){
        return bookId;
    }
    public void setBookId(int bookId){
        this.bookId=bookId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setPublisher(String publisher){
        this.publisher=publisher;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getPages(){
        return pages;
    }
    public void setPages(int pages){
        this.pages=pages;
    }
    public String getGenre(){
        return genre;
    }
    public void setGenre(String genre){
        this.genre=genre;
    }

    public int getEdition(){
        return edition;
    }
    public void setEdition(int edition){
        this.edition=edition;
    }
    public String getLanguage(){
        return language;
    }

    public void setLanguage(String language){
        this.language=language;
    }
}