package EpamJavaTrainee.BasicOOP.TextFile;

public class ImageFiles extends Files{
    public ImageFiles(String name, String text) {
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

    @Override
    public void rename(String newName) {
        setName(newName);
    }

    @Override
    public void correct(String text) {
        System.out.println(this.text);
    }

    @Override
    public void delete() {

    }
}
