package EpamJavaTrainee.Algorithmization.Dec4;

public class SimpleNumb {

    public void check (int a, int b, int c) {

        Sort sorted = new Sort();
        int [] m = sorted.sort(a,b,c);
        int [] m1 = new int[a];
        int numb = 0;
        for (int i = 2; i <= a; i++) {
            if (a%i==0){
                m1[numb] = i;
                numb++;
            }

        }
        int lock = 0;
        for (int i = m.length - 1; i > 0 ; i--) {
            for (int j = 0; j < m1.length; j++) {

                if(m1[j]!= 0 && m[i]%m1[j]==0){
                    System.out.println("Число - " + m[i] + " не взаимнопростое");
                    lock++;
                    break;
                }

            }
        }
        if(lock == 0) {
            System.out.println("Все числа взаимно простые");
        }
    }
}
