package EpamJavaTrainee.StringWork.St8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class St8 {
    public static void main(String[] args) {
        String s = "My naaame is Denis, i want be a development";
        Pattern pattern = Pattern.compile("a");
        Matcher matcher = pattern.matcher(s);
        int counter = 0;

            while (matcher.find()){
                counter++;
                System.out.println(matcher.group());
        }
        System.out.println(counter);

    }
}
