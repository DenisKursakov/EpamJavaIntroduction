package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line1 {
    static double func(double a, double b, double c){
        double z = ((a - 3) * b / 2) + c;
        System.out.println(z);
        return z;
    }
    public static void main(String[] args) {
        func(4,2,0);
    }
}
