package EpamJavaTrainee.Classes.Test9;

import java.util.Scanner;

public class Words {
    public void searchWord (Sentences [][] sentences){
        System.out.println("Введите слово из текста для перевода");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < sentences.length; i++) {
            for (int j = 0; j < sentences[i].length; j++) {
                if(s.equals(sentences[i][j])){
                    System.out.println("Перевод слова: " + s + " осуществлен");
                    count++;
                }
            }
        }
        if(count == 0) {
            System.out.println("Данное слово не найдено");
        }

    }
}
