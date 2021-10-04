package EpamJavaTrainee.BasicOOP.TextFile;

public class  TextFile extends Files {
    public TextFile(String name, String text) {
        this.name = name;
        this.text = text;
    }

    private String name;
    private String text;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public void rename (String name){
        setName(name);
    }

    @Override
    public void correct(String text) {
        setText( getText() +" "+ text);
    }

    @Override
    public void delete() {

    }
}
