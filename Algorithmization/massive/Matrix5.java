package EpamJavaTrainee.Algorithmization.massive;

public class Matrix5 {
    public static void main(String[] args) {
        int[][] m = {{3,4,5},
                     {2,3,4},
                     {1,9,3}};
        int sum1 = 0;
        int sum2 = 0;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length ; j++) {

                    sum1 += m[j][count];
                }
            System.out.println("Сумма " + count + " столбца = " + sum1);

            if(sum2<sum1) {
                count2 = count;
                sum2 = sum1;
            }
            count++;
            sum1 = 0;
            }

        System.out.println("Наибольшая сумма : " + sum2 + " в столбце: " + count2);
    }
}
