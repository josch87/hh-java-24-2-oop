package domain;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

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
