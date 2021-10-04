package EpamJavaTrainee.Algorithmization.Dec1;

public class Nod {
    public static void main(String[] args) {
        getNod(2,14,21, 7);
    }
    public static int getNod (int a, int b, int c, int d){

        int [] m = {a,b,c,d};
        int lit;
        int t ;
        int k = 1;
        for (int i = 0; i < m.length; i++) {
            for (int j = k; j < m.length ; j++) {
                if(m[i] > m[j]) {
                    t = m[i];
                    m[i] = m[j];
                    m[j] = t;
                }
            }
            System.out.print(m[i] + "\t");
            k++;
        }

        System.out.println();
        lit = m[0];
        int[] n = new int[lit];
        int count = 0;
        for (int i = 1; i <= n.length; i++) {
            if(lit%i == 0) {
                n[count] = i;
                count++;
            }
        }
        int nod = 0;
        for (int i = lit - 1; i > 0; i--) {
            if (n[i] != 0 && a%n[i] == 0 && b%n[i] == 0 && c%n[i] == 0 && d%n[i]==0) {
                System.out.println("НОД: " + n[i]);
                nod = n[i];
                break;
            }
        }
        return nod;
    }
}
