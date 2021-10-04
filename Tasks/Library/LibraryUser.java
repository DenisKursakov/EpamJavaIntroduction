package EpamJavaTrainee.Tasks.Library;

import EpamJavaTrainee.Tasks.Library.Books.Book;
import EpamJavaTrainee.Tasks.Library.Books.BooksCatalog;

import java.io.IOException;

public class LibraryUser {
    private String name;

    public LibraryUser(String name) {
        this.name = name;
    }
    public void viewList (BooksCatalog catalog) throws IOException {
        for (int i = 0; i < catalog.getCatalog().size(); i++) {
            System.out.println(catalog.getCatalog().get(i));
        }
    }
    public String searchBook (BooksCatalog catalog, String name) throws IOException {

        for (int i = 0; i < catalog.getCatalog().size(); i++) {
            if (catalog.getCatalog().get(i).contains(name)){
                return catalog.getCatalog().get(i);
            }
        }
        return "Книга не найдена";
    }
    public String searchBook (BooksCatalog catalog, Book book) throws IOException {
        for (int i = 0; i < catalog.getCatalog().size(); i++) {
            if (catalog.getCatalog().get(i).equals(book.info())){
                return catalog.getCatalog().get(i);
            }
        }
        return "Книга не найдена";
    }

}
