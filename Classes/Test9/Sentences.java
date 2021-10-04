package EpamJavaTrainee.Classes.Test9;

import java.util.Locale;
import java.util.Scanner;

public class Sentences {
    private String [] text = new String[100];
    public void sentenceAdd(){
        System.out.print("Введите заголовок текста: ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        System.out.println();
        s1 = s1.toUpperCase(Locale.ROOT);
        text[0] = s1;
        String end = "The end.";
        int count = 0;
        int i = 1;
        do {
            System.out.print("Введите следующее предложение: ");
            Scanner scanner1 = new Scanner(System.in);
            String s2 = scanner1.nextLine();
            text[i] = s2;
            i++;
            if (s2.equals(end)){
                count++;
            }

        } while (count <= 0);
    }
    public void getText(){
        for (int i = 0; i < text.length ; i++) {
            if(text[i] == null){
                return;
            }
            System.out.println(text[i]);
        }
    }
}
