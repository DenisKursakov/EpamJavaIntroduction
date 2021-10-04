package EpamJavaTrainee.StringWork.St4;

public class St4 {
    public static void main(String[] args) {
        String s = " Hello, my  name  is Denis ";
        System.out.println(s);
        s = s.replaceAll("\\s+", " ");
        s = s.trim();
        System.out.println(s);


    }
}
