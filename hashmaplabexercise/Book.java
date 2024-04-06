package hashmaplabexercise;

import java.util.HashMap;

public class Book {

    private String Isbn;
    private String title;
    private Author author;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    private HashMap<String, Author> authorHashMap;

    public HashMap<String, Author> getAuthorHashMap() {
        return authorHashMap;
    }

    public void setAuthorHashMap(HashMap<String, Author> authorHashMap) {
        this.authorHashMap = authorHashMap;
    }



    public String getIsbn() {
        return Isbn;
    }

    public void setIsbn(String isbn) {
        Isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
