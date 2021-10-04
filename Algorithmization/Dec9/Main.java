package EpamJavaTrainee.Algorithmization.Dec9;

public class Main {
    public static void main(String[] args) {
       int  n = 153;
        int count = 0;
        int counter = 1;

        double k = n;
        do {
            k = k/10;
            if(k > 1) {
                counter++;
            } else count++;

        }while (count <= 1);
        int[] m = new int[counter];
        k = n;
        for (int i = 0; i < m.length; i++) {
            k = k/10;
            if (k > 0) {
                double j = 0;
               j = (k - (int)k)*10;
               m[i] = (int)j;
            }
            System.out.println(m[i]);
        }
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum = sum + Math.pow(m[i], counter);
        }
        int s = (int)sum;
        System.out.println(n + " - " + s);
        if(s == n) {
            System.out.println(n + " число амстронга");
        } else System.out.println(n + " не число амстронга");

    }
}
