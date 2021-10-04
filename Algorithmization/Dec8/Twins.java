package EpamJavaTrainee.Algorithmization.Dec8;

public class Twins {
    public void twin (int n){
        int[] m = new int[15];
        int k = n;
        int id = 0;
        for (int i = k; i <= n*2 ; i++) {
            for (int j = n; j <=n*2 ; j++) {
                if(j - 2 == i){
                    m[id] = i;
                    id++;
                    m[id] = j;
                    id++;
                    System.out.println(i + " и " + j + " близнецы");
                }
            }
        }
        for (int i = 0; i < m.length; i++) {

        }
    }
}
