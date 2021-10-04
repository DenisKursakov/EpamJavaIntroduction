package EpamJavaTrainee.Algorithmization.Dec10;

public class Main {
    public static void main(String[] args) {
        Numb numb = new Numb();
        int n = 1;
        double k = Math.pow(10,n);
        int a = (int)k;
        for (int i = a; i < 99 ; i++) {
            numb.number(i);
        }

    }
}
