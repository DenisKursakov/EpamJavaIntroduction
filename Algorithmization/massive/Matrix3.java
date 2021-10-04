package EpamJavaTrainee.Algorithmization.massive;

public class Matrix3 {
    public static void main(String[] args) {
        int n = 10;
        int[][] m = new int[n][n];
//        for (int i = 0; i < m.length; i++) {
//            for (int j = 0; j < n; j++) {
//                m[i][j] = i+1;
//            }
//            n--;
//        }

        for (int i = 0; i < m.length; i++) {

            for (int j = i; j < m.length - i; j++) {
                m[i][j] = 1;
                m[n - 1][j] = 1;
            }
            if(n>1){
                n--;
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
