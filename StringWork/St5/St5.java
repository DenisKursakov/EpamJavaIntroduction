package EpamJavaTrainee.StringWork.St5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class St5 {
    public static void main(String[] args) {
        String s = "Search  more     spaces";
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher(s);
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < 1; i++) {

            while (m.find()) {
                count = m.group().length();
                if(count > count2){
                    count2 = count;
                }
            }


        }
        System.out.println("More spaces^: " + count2);
    }
}
