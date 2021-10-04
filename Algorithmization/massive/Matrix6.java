package EpamJavaTrainee.Algorithmization.massive;

import java.util.Random;

public class Matrix6 {
    public static void main(String[] args) {
        int k = 10, l = 20;
        int[][] m = new int[k][l];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(15);
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();

        }
        int count = 0;
        int count2 = 0;
        int numb = 0;
        for (int i = 0; i < l ; i++) {

            for (int j = 0; j < m.length; j++) {
                if (m[j][numb] == 5) {
                    count++;
                }
            }
            if (count >= 3){
                count2 = count;
                System.out.println("Строка: " + (numb+1) + " - " + count + " элементов");
            }
            numb++;
            count = 0;
        }
        if (count2 == 0) System.out.println("В столбцах матрицы отсутствует нужное кол-во элементов");

    }
}
