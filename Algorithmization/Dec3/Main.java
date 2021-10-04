package EpamJavaTrainee.Algorithmization.Dec3;

public class Main {
    public static void main(String[] args) {
        Massive massive = new Massive();
        int [] m = {8,11,22,22,11,11,2,3,9,22,22};
        massive.second(m);
        System.out.println("Второе по велечине число: " + massive.second(m));
    }
}
