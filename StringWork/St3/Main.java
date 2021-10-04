package EpamJavaTrainee.StringWork.St3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
    String my_string = "кофе 300;чай 500;какао 3;кофе 456";
    Pattern p = Pattern.compile("(\\d+)");
    Matcher m = p.matcher(my_string);
    int count = 0;

    while (m.find()) {
        System.out.println(Integer.parseInt(m.group()));
        count++;
    }

    System.out.println("Количество чисел: " + count);


}
}
