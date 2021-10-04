package EpamJavaTrainee.Classes.Test6;

public class Main {
    public static void main(String[] args) {
        Test6 client1 = new Test6(1, "Kurcaskov", "Pisina", 123, 10);
        Test6 client2 = new Test6(2, "Lurcaskov ", "Pisina", 523, 10);
        Test6 client3 = new Test6(5, "Purcaskov ", "Pisina", 1223, 10);
        Test6 client4 = new Test6(4, "Durcaskov ", "Pisina", 723, 10);
        Test6 client5 = new Test6(3, "Aurcaskov ", "Pisina", 323, 10);
        Test6[] test = {client1,client2,client4,client3,client5};
        client1.sort(test);
    }
}
