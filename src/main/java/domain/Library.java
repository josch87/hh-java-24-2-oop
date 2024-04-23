package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    public Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public void addBook(Book newBook) {
        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        bookList.add(newBook);
        Book[] booksArray = bookList.toArray(new Book[0]);
        setBooks(booksArray);
    }

    public void deleteBook(Book bookToDelete) {
        int arrayLength = books.length;
        Book[] newBookArray = new Book[arrayLength - 1];
        int i = 0;

        for (Book book : books) {
            if (!bookToDelete.equals(book)) {
                newBookArray[i++] = book;
            }
        }

        books = newBookArray;
    }

    //public void deleteBook(Book book){
    //
    //}

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Library:\n");
        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }

}
