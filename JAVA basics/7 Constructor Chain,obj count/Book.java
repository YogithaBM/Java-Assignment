class Book{
	String title;
	String author;
	String publisher;
	int publicationYear;
	double price;
	int pages;
	String genre;
	boolean isAvailable;
	String isbn;
	String language;
	static int count=0;
    
	Book(){
        System.out.println("Constructor with 0 parameters executed");
    }
    
    Book(String title,String author){
        this(); 
        this.title=title;
        this.author=author;
        System.out.println("Constructor with 2 parameters executed");
    }
   
    Book(String title,String author,
	String publisher){
        this(title, author);
        this.publisher=publisher;
        System.out.println("Constructor with 3 parameters executed");
    }


    Book(String title,String author,
	String publisher,
	int publicationYear,double price){
        this(title, author, publisher);
        this.publicationYear=publicationYear;
        this.price=price;
        System.out.println("Constructor with 5 parameters executed");
    }

    Book(String title,String author,
	String publisher,
	int publicationYear,double price,
	int pages,String genre,
	boolean isAvailable){

        this(title, author, publisher,
         publicationYear, price);
        this.pages=pages;
        this.genre=genre;
        this.isAvailable=isAvailable;
        System.out.println("Constructor with 8 parameters executed");
    }
	
    Book(String title,String author,
	String publisher,
	int publicationYear,double price,
	int pages,String genre,
	boolean isAvailable,
	String isbn,String language){

        this(title, author, publisher,
         publicationYear, price,pages,genre,isAvailable);
        this.isbn=isbn;
        this.language=language;
        System.out.println("Constructor with 10 parameters executed");
		count++;
    } 
	
    public void display() {
		System.out.println("BOOK DETAILS");
		System.out.println(title);
		System.out.println(author);
		System.out.println(publisher);
		System.out.println(publicationYear);
		System.out.println(price);
		System.out.println(pages);
		System.out.println(genre);
		System.out.println(isAvailable);
		System.out.println(isbn);
		System.out.println(language);
		System.out.println("Burger count: "+count);
	}
}