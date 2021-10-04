package EpamJavaTrainee.Tasks.Library.Books;

public abstract class Book {
    protected String name;
    protected String author;
    protected String type;
    protected String info;
    public Book (String name, String author, String type, String info){
        this.name = name;
        this.author = author;
        this.type = type;
        this.info = info;
    }
    public String info (){
        return this.name + " " + this.author + " " + this.info + " " + this.type;
    }
    public String getName (){
        return name;
    }
}
