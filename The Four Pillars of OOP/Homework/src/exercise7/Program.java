package exercise7;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Book book1 = new Book("The Secret", "lyly", "Mindset");
        Book book2 = new Book("The Secret2", "jenny", "Novel");
        Book book3 = new Book("The Secret3", "tyty", "Education");
        Book book4 = new Book("The Secret4", "jonh", "History");

        BookLibrary bookLibrary = new BookLibrary();
        bookLibrary.adding(book1);
        bookLibrary.adding(book2);
        bookLibrary.adding(book3);
        bookLibrary.adding(book4);

        bookLibrary.removeBook(book1);

        bookLibrary.checkOut("jonh", "The Secret4");

        bookLibrary.returnBook("tyty");

        bookLibrary.generating();

    }
}
abstract class Library {

    abstract void adding(Book book);
    abstract void removeBook(Book book);
    abstract void checkOut(String name, String title);
    abstract void returnBook(String  name);
    abstract void generating();
}

class BookLibrary extends Library{

    private HashMap< String, Book> listOfBooks;
    private HashMap<String , Book> checkOutBook;

    public BookLibrary() {
        listOfBooks = new HashMap<>();
        checkOutBook = new HashMap<>();
    }


    void adding(Book book) {
        listOfBooks.put(book.getTitle(), book);
    }

    void removeBook(Book book) {
        listOfBooks.remove(book.getTitle());
    }

    void checkOut(String name, String title) {
        if (listOfBooks.containsKey(title)){
            checkOutBook.put(name,listOfBooks.get(title));
            listOfBooks.remove(title);
        }
        else {
            System.out.println(title + " Book Not Found...");
        }
    }

    void returnBook(String  name) {
        if (checkOutBook.containsKey(name)){
            Book book = checkOutBook.get(name);
            listOfBooks.put(book.getTitle(), book);
        }
        else {
            System.out.println(name + " Name not found...");
        }
    }

    void generating() {
        System.out.println("Book in library");
        for (Map.Entry<String, Book> book : listOfBooks.entrySet()){
            System.out.println(book.getKey() + book.getValue());
        }
        System.out.println("Borrowed Book from library");
        for (Map.Entry<String , Book> borrowBook : checkOutBook.entrySet()){
            System.out.println(borrowBook.getKey() + borrowBook.getValue());
        }
    }
}


class Book{
    private String title;
    private String author;
    private String type;

    public Book(String title, String author, String type) {
        this.title = title;
        this.author = author;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
