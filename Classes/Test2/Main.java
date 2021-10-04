package EpamJavaTrainee.Classes.Test2;

public class Main {
    public static void main(String[] args) {
        Students students1 = new Students();
        students1.name = "Oleg";
        students1.m = new int[]{9, 9, 9, 9, 10};
        students1.group = 1;
        Students students2 = new Students();
        students2.m = new int[]{1, 2, 3, 4, 4};
        students2.name = "Sawo";
        Students students3 = new Students();
        students3.m = new int[]{9, 9, 10, 10, 9};
        students3.name = "Kir";
        Students[] students = new Students[10];
        students[0] = students1;
        students[1] = students2;
        students[1] = students3;
        boolean check;
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 5; j++) {
                if (students[i].m[j] >= 9) {
                    check = true;
                } else {
                    check = false;
                    return;
                }
            }
            if (check = true) {
                System.out.println(students[i].name);
                check = false;
            }
        }

    }
}
