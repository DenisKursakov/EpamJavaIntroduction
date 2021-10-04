package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line2 {
     static double func(double a, double b, double c){
         double z = ((b + Math.sqrt(Math.pow(b,2) + 4*a*c))/(2*a)) - Math.pow(a,3) + Math.pow(b,-2);
         System.out.println(z);
         return z;
     }
    public static void main(String[] args) {
        func(3,7,2);
    }
}
