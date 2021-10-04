package EpamJavaTrainee.Algorithmization.massive;

public class Matrix1 {
    public static void main(String[] args) {
        Matrix1 matrix1 = new Matrix1();
        int[][] matrix = {{9, 4, 6, 4},
                {5, 3, 1, 2},
                {4, 2, 9, 3},
                {1, 6, 9, 8}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //if(i == j || i + j == matrix.length-1) {
                //  System.out.println(matrix[i][j]);
                // }
                if (i == 0 && j % 2 == 0) {
                    matrix1.st(matrix, j);
                }

            }
        }

    }


    public void st(int[][] a, int b) {
        for (int i = 0; i < a.length; i++) {
            if (a[0][b] > a[a.length - 1][b]) {

                System.out.println(a[i][b]);
            }

            for (int j = 0; j < a[i].length; j++) {

            }

        }
    }
}
