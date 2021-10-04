package EpamJavaTrainee.Algorithmization.massive;

public class Massive1 {
    public static void main(String[] args) {
        int[] mas = {2,4,4,4,7,6,4,4, 3, 3, 2, 2, 1, 3, 3,8,11,1,1,1,2};
        int counter1 = 0;
        int counter2 = 0;
        int size = 0;
        int a = 0;
        int min = 0;
        for (int i = 0; i < mas.length; i++) {
            int j;
            for (j = 0; j < mas.length; j++) {
                if (mas[i] > mas[j]) {
                    int t = mas[i];
                    mas[i] = mas[j];
                    mas[j] = t;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        int[] mas1 = new int[mas.length];
        for (int i = 1; i < mas.length; i++) {


            if (mas[i - 1] != mas[i]) {
                mas1[a] = mas[i - 1];
                a++;
            }
        }
        mas1[a] = mas[mas.length - 1];

        System.out.println();
        for (int j = 0; j < mas1.length; j++) {
            if(mas1[j] != 0){
                size++;
            }
            System.out.print(mas1[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < mas.length; j++) {
                if (mas1[i] == mas[j] ) {
                    counter1++;
                }
            }
            if (counter1 > counter2) {
                counter2 = counter1;
                counter1 = 0;
                min = mas1[i];

            }else if (counter1 == counter2 && mas1[i]!=0) {
                min = mas1[i];
                counter1 = 0;
            }else counter1 = 0;

        }
        System.out.println("Элемент: " + min +"\n"+"Кол-во повторений: " + counter2);
    }
}
