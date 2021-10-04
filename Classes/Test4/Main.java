package EpamJavaTrainee.Classes.Test4;

public class Main {
    public static void main(String[] args) {
        Test4 test = new Test4();
        test.newrealy();
        test.up(test.getRealy());
        System.out.println(test.getRealy());
        test.down(test.getRealy());
    }
}
