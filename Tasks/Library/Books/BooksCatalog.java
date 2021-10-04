package EpamJavaTrainee.Tasks.Library.Books;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class BooksCatalog {
    public BooksCatalog (){

    }
    private Path booksCatalog = Paths.get("C:\\IT\\testDirectory\\booksCatalog.txt");

    public List<String> getCatalog () throws IOException {
        return Files.readAllLines(booksCatalog);
    }
    public void addInto (Book book) throws IOException {
        List<String> list = new ArrayList<>();
        list.add(book.info());
        Files.write(booksCatalog, list, StandardCharsets.UTF_8, StandardOpenOption.APPEND);
    }
    public void delete (Book book) throws IOException {
        List<String> list = Files.readAllLines(booksCatalog);
        for (int i = 0; i < list.size(); i++) {
            if(book.info().equals(list.get(i))){
                list.remove(list.get(i));
            }
        }
        Files.write(booksCatalog,list);
    }

}
