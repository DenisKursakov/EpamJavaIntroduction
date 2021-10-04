package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line6 {
    static boolean coordinates(int x, int y) {
        boolean con = true;
        if ((y <= 4 && y >= 0) && (x >= -2 && x <= 2)) {
            System.out.println("Координаты в диапозоне ");
            return true;
        } else if ((y <= 0 && y >= -4) && (x >= -4 && x <= 4)) {
            System.out.println("Координаты в диапозоне");
            return true;
        } else System.out.println("Координаты вне диапозона");
        return false;

    }

    public static void main(String[] args) {
        coordinates(6, 3);
    }
}
