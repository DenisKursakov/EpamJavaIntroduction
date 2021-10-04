package EpamJavaTrainee.StringWork.St2;

public class St2 {
    public static void main(String[] args) {
        String s = "I will like word, loveword";
        String regex = "word";
        String relep = "letter";
        s = s.replaceAll(regex,relep);
        System.out.println(s);
    }
}
