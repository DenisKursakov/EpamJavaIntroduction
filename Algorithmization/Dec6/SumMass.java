package EpamJavaTrainee.Algorithmization.Dec6;

public class SumMass {
public void sum (int[] m, int k1, int k2){
    int sum = 0;
    for (int i = k1; i <= k2 ; i++) {
        sum = sum + m[i];
    }
    System.out.println(sum);
}
}
