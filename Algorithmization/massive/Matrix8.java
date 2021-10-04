package EpamJavaTrainee.Algorithmization.massive;

public class Matrix8 {
    public static void main(String[] args) {
        int k = 1;
        int[] m = {8, 8, 8, 3, 4, 6};
        int[] m1 = {2, 2};
        int l = 0;
        for (int i = k; i < m1.length + k ; i++) {

            m[i+m1.length+1] = m[i+1];
            m[i+1] = m1[l];
            l++;
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + "\t");
        }

    }
}

