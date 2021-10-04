package EpamJavaTrainee.Algorithmization.massive;

public class Matrix2 {
    public static void main(String[] args) {
        int n = 8;
        int[][] m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            n = 8;
            for (int j = 0; j < m[i].length; j++) {
                if (i % 2 == 0) {
                    m[i][j] = j+1;
                } else {
                    m[i][j] = n;
                    n--;
                }
                System.out.print(m[i][j] + " ");
            }
            System.out.println();

        }
    }
}
