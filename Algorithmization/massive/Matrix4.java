package EpamJavaTrainee.Algorithmization.massive;

import java.util.Scanner;

public class Matrix4 {
    public static void main(String[] args) {
       int[][] m = {{1,2,4,2},
                    {3,8,4,3},
                    {4,4,2,4},
                    {9,7,2,1}} ;
        System.out.println("Дан массив:");
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номера стоблцов для изменения: 0-3");
       Scanner scanner1 = new Scanner(System.in);
       Scanner scanner2 = new Scanner(System.in);
       int x = scanner1.nextInt() ;
       int y = scanner2.nextInt() ;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                int t;
                if (j == x){
               t = m[i][y];
               m[i][y] = m[i][j];
               m[i][j] = t;}
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.println();
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j] + " ");
            }
        }
    }
}
