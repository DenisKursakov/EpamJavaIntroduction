package EpamJavaTrainee.BasicOOP.TextFile;

import java.util.HashMap;
import java.util.Map;

public class Directory {
    private String name ;
    private final Directory parantDirectory;
    Map<String,TextFile> map = new HashMap<>();
    public Directory(String name, Directory parantDirectory) {
        this.name = name;
        this.parantDirectory = parantDirectory;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Directory getParantDirectory() {
        return parantDirectory;
    }

    public Directory createNewDirectory (String name){
        Directory d = new Directory(name,this);

        return d;
    }
    public TextFile createNewTextFile (String name, String text){
        TextFile t = new TextFile(name,text);
        map.put(name,t);
        return t;
    }
    public ImageFiles createNewImageFile (String name, String text){
        ImageFiles i = new ImageFiles(name,"Это не текстовый файл (Вот моя картинка)");

        return i ;
    }
}
