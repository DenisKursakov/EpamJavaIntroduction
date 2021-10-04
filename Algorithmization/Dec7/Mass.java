package EpamJavaTrainee.Algorithmization.Dec7;

public class Mass {
    public int count (double n){
        int counter = 1;
        int count = 0;

        do {
            n = n/10;
            if(n > 1){
                counter++;
            } else count++;

        }while (count <= 1);
        return counter;
    }
}
