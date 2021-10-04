package EpamJavaTrainee.Algorithmization.Dec3;

public class Massive {
    public int second(int[] m) {
        int k = 1;
        int t = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = k; j < m.length; j++) {
                if (m[i] > m[j]) {
                    t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
            System.out.print(m[i] + "\t");
            k++;
        }
        System.out.println();
        int sec = 0;
        for (int i = m.length - 1 ; i > 0 ; i--) {
            if(m[i] != m[i - 1]){
                sec = m[i-1];
                break;
            }

        }
        return sec;
    }
}
