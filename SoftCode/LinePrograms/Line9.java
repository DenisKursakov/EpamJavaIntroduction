package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line9 {
    public static void main(String[] args) {

        int x1 = 1,x2 = 1,x3 = 1,y1 = 1,y2 = 3,y3 = 9;
        if ((x2-x1)/(y2-y1) == (x3-x2)/(y3-y2)) {
            System.out.println("Прямая");
        } else System.out.println("Не прямая");
    }
}
