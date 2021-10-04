package EpamJavaTrainee.Algorithmization.Dec2;

public class Triangle {
    public static void main(String[] args) {
        int a = 6;

        double s = 6 * areaT(a);
        System.out.println(s);
    }
    public static double areaT (int a){

       double s = Math.pow(a,2) * Math.sqrt(3)/4;
        return s;
    }
}
