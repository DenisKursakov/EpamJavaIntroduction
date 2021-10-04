package EpamJavaTrainee.Algorithmization.Dec7;

public class Main {
    public static void main(String[] args) {
        double n = 1534;
        Mass mass = new Mass();
        int counter = mass.count(n);
      int [] m = new int[counter];
        int count = 0;
        int num = 0;

        for (int i = 0; i < counter; i++) {
            n = n/10;
            int k = (int) n;
            if(n >= 0){
                double j = (n - k)*10;
                m[num] = (int) j; ;
                num++;
            }
        }
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i] + "\t");
        }
    }
}
