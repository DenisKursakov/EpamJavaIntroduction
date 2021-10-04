package EpamJavaTrainee.Algorithmization.Dec10;

public class Numb {
    public void number (int n) {
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
        }
        int size = 1;
        for (int i = 1; i < m.length; i++) {

                if(m[i-1] > m[i]){
                    size++;
                }
        }
        if(size == counter) {
            System.out.println(n + " возрастающее число");
        }
    }
}
