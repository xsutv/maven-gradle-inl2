public class Bok {
    private String title;
    private String isbn;
    private String author;

    public Bok(String title, String isbn, String author) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
    }


    @Override
    public String toString() {
        return String.format("%nResulutat%nTitel: %s%nFörfattare: %s%nISBN: %s%n", title, author, isbn);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    } 

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    
}
