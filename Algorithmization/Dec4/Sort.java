package EpamJavaTrainee.Algorithmization.Dec4;

public class Sort {
    public int[] sort (int a, int b , int c){
        int [] m  = {a,b,c};
        int t;
        int k = 1;
        for (int i = 0; i < m.length ; i++) {
            for (int j = k; j < m.length; j++) {
                if(m[i] > m[j]){
                    t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
            k++;

        }
        return m;
    }
}
