package EpamJavaTrainee.Algorithmization.massive;

import java.util.Random;

public class Matrix7 {
    public static void main(String[] args) {
        int k = 6, l = 6;
        int[][] m = new int[k][l];
        Random random = new Random();

        int count = 0;
        for (int i = 0; i <= l; i++) {
            count = 0;
            for (int j = 0; j < k; j++) {
                if(count != i) {
                    m[j][i-1] = 1;
                    count++;
                }
            }
        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {

                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
