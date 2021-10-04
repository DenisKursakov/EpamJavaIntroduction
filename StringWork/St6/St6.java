package EpamJavaTrainee.StringWork.St6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class St6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Come on, your future can be alone");
        Pattern p = Pattern.compile("[a]");
        Matcher m = p.matcher(s);

        int count = 0;
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = 'a';
            if(s.charAt(i) == ch){
                count = i;
                s.insert(count+1,"b");
            }
        }

        System.out.println(s);


    }
}
