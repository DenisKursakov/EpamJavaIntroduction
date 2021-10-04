package EpamJavaTrainee.StringWork.St7;

public class St8 {
    public static void main(String[] args) {
        String s = "wwow";
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
                if (s.charAt(j) == s.charAt(i)) {
                    j--;
                } else {
                    System.out.println("Слово не палиндром");
                    return;
                }
        }
        System.out.println("Слово: " + s + " - полиндром!");
    }
}
