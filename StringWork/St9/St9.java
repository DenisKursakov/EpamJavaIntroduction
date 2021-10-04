package EpamJavaTrainee.StringWork.St9;

public class St9 {
    public static void main(String[] args) {
        String s = "abcde";
        int size = s.length() * 2;
        StringBuilder s1 = new StringBuilder(size);
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            s1.insert(k,s.charAt(i));
            k++;
            s1.insert(k,s.charAt(i));
            k++;
        }
        System.out.println(s1);
    }
}
