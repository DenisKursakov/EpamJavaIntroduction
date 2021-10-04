package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line4 {
    public static void main(String[] args) {
        double x = 222.333;
        double n = (int) x;
        double result = n * 0.001 + (x - n) * 1000;
        System.out.println(result);
    }
}

