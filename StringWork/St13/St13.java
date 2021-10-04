package EpamJavaTrainee.StringWork.St13;

public class St13 {
    public static void main(String[] args) {
        String s = "My name is Denis. I am man! Good_ luck;";
        s = s.replaceAll("_", ".");
        s = s.replaceAll(" ", "_");
        s = s.replaceAll("\\W",".");
        s = s.replaceAll("_", " ");

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '.'){
                counter++;
            }
        }
        System.out.println(s);
        System.out.println(counter);
    }
}
