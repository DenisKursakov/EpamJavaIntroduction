package EpamJavaTrainee.Tasks.Library.Books;

public class PaperBooks extends Book{

    public PaperBooks(String name, String author, String type, String info) {
        super(name, author, type, info);
    }

    @Override
    public String info() {
       return super.info();
    }

    @Override
    public String getName() {
        return super.getName();
    }
}
