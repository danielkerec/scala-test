package models;

import java.util.HashSet;
import java.util.Set;

public class Book {

    public Integer id;
    public String title;
    public Integer price;
    public String author;

    public Book(){

    }

    public Book(Integer id, Integer price, String title, String author){
        this.id = id;
        this.price = price;
        this.title = title;
        this.author = author;
    }

    private static Set<Book> books;

    static {
        books = new HashSet<>();
        books.add(new Book(1, 20, "C++", "ABC"));
        books.add(new Book(2, 16, "java", "test"));

    }

    public static Set<Book> allBooks(){
        return books;
    }

    public static Book findById(Integer id){
        for(Book book: books){
            if(id.equals(book.id)){
                return book;
            }
        }

        return null;
    }

    public static void add(Book book){
        books.add(book);
    }

    public static boolean remove(Book book){
        return books.remove(book);
    }

}
