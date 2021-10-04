package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line8 {

    void max (int a, int b, int c, int d) {
        System.out.println(Math.max(Math.min(a,b) , Math.min(c,d)));
    }

    public static void main(String[] args) {
        Line8 lin = new Line8();
        lin.max(1,2,3,4);
    }
}
