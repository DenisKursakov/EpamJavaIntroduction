package EpamJavaTrainee.Algorithmization.Dec5;

public class Fact {
    public int factor (int i){
        int k = 1;
        for (int j = 1; j <= i; j++) {
            k *= j;
        }
        return k;
    }
}
