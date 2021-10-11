package EpamJavaTrainee.Tasks.Library;

import EpamJavaTrainee.Tasks.Library.Books.Book;
import EpamJavaTrainee.Tasks.Library.Books.BooksCatalog;

import java.io.IOException;

public class LibraryAdmin {
    private String name;

    public LibraryAdmin(String name) {
        this.name = name;

    }

    public void viewList (BooksCatalog catalog) throws IOException {
        for (int i = 0; i < catalog.getCatalog().size(); i++) {
            System.out.println(catalog.getCatalog().get(i));
        }
    }
    public void deleteBook (BooksCatalog catalog, Book book) throws IOException {
        catalog.delete(book);
        System.out.println("Книга: " + book.getName() + " удалена" );
    }
    public void addBook (BooksCatalog catalog, Book book) throws IOException {
        catalog.addInto(book);
    }

}
