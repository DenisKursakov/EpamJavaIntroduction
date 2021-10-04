package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line7 {
    static void Angle(int x, int y) {
        int z = 180 - (x + y);
        if ((x + y) < 180) {
            System.out.println("Треугольник существует!");
            if (x == 90 || y == 90 || z == 90) {
                System.out.println("Это прямоугольный треугольник");
            } else System.out.println("Треугольник не прямоугольный");
        } else System.out.println("Треугольника не существует");
    }

    public static void main(String[] args) {
        Angle(110,90);
    }
}


