package EpamJavaTrainee.Classes.Test7;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(1,"Cat","Owner","Byte", 2010,310,1200,"paper");
        Book book2 = new Book(1,"Cat1","Owner1","Byte1", 2015,310,1200,"paper");
        Book book3 = new Book(1,"Cat2","Owner2","Byte2", 2010,310,1200,"paper");
        Book book4 = new Book(1,"Cat3","Owner","Byte1", 2013,310,1200,"paper");
        Book book5 = new Book(1,"Cat4","Owner2","Byte", 2015,310,1200,"paper");
        Book[] books = {book1,book2,book3,book4,book5};
        book1.searchAuthor(books);
        book1.searchP(books);
        book1.searchYear(books);
    }
}
