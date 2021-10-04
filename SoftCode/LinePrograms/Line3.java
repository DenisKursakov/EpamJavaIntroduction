package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line3 {
    static double func (double x, double y){
        double z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y);
        System.out.println(z);
        return z;
    }
    public static void main(String[] args) {
        func(30,150);
    }
}
