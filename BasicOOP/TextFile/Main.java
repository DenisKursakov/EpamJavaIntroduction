package EpamJavaTrainee.BasicOOP.TextFile;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("Pac1", null);
        Directory dir2 = directory.createNewDirectory("Pac2");
        System.out.println(dir2.getName() +" находиться в "+ dir2.getParantDirectory().getName());
        TextFile t = dir2.createNewTextFile("Text1", "Abra Kadabra");
        TextFile text1 = dir2.createNewTextFile("Text2", "Abra Kadab123123");
        System.out.println(dir2.map.get("Text1").getText());



    }
}
