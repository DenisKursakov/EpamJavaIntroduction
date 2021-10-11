package EpamJavaTrainee.Tasks.Library;

import EpamJavaTrainee.Tasks.Library.Books.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        Path usersFile = Paths.get("C:\\IT\\testDirectory\\usersFile.txt");
        LibraryAdmin admin = new LibraryAdmin("Alex");
        LibraryUser user = new LibraryUser("User");
        Sing sing = new Sing();
//        sing.registration();
//        sing.tryEnter();
//        sing.registration();
        Book b1 = new EclectoBooks("Безымянный раб","Зыков В.","electronic","Книга о безымянном работе");
        Book b2 = new EclectoBooks("Господство Неспящих","Зыков В.","electronic","Книга о постапокалипсисе");
        Book b3 = new PaperBooks("Осколки сердец","Нестер И.","paper","Книга о вампире");
        Book b4 = new PaperBooks("Страж","Пехов А.","paper","Книга о призраках");
        BooksCatalog catalog = new BooksCatalog();
        admin.addBook(catalog,b1);
        admin.addBook(catalog,b2);
        admin.addBook(catalog,b3);
        admin.addBook(catalog,b4);
//        user.viewList(catalog);               //Показать список книг
//        System.out.println(user.searchBook(catalog,"Страж")); // Найти книгу по имени
//        System.out.println(user.searchBook(catalog,b2));            // Найти книгу по объекту "книга"
//        admin.deleteBook(catalog,b1);                   //удалить книгу, админ метод
//        admin.viewList(catalog);



    }
}
















