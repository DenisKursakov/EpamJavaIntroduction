package EpamJavaTrainee.Classes.Test3;

public class Main {
    public static void main(String[] args) {
        Trains train1 = new Trains();
        train1.setName("Moscow");
        train1.setNumb(4);
        train1.setTime(18);
        Trains train2 = new Trains();
        train2.setName("Thai");
        train2.setNumb(2);
        train2.setTime(12);
        Trains train3 = new Trains();
        train3.setName("Mogilev");
        train3.setNumb(1);
        train3.setTime(10);
        Trains train4 = new Trains();
        train4.setName("Moscow");
        train4.setNumb(3);
        train4.setTime(9);
        Trains train5 = new Trains();
        train5.setName("German");
        train5.setNumb(5);
        train5.setTime(18);
        Trains [] t = {train1,train2,train3,train4,train5};
        train1.sort(t);
        train1.sortplace(t);
        train1.info(t);


    }
}
