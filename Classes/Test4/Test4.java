package EpamJavaTrainee.Classes.Test4;

import java.util.Scanner;

public class Test4 {
    int max = 10;
    int min = 0;
    private int realy = 1;

    public int getRealy() {
        return realy;
    }

    public void setRealy(int realy) {
        this.realy = realy;
    }
    public void newrealy() {
        System.out.println("Задайте состояние счетчика");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        if(k <= max && k>= min) {
            setRealy(k);
        } else return;
        System.out.println(realy);

    }

    public int up (int realy){
        if(realy+1 <= max) {
            realy++;
            System.out.println(realy);
        }
        return realy;
    }
    public int down (int realy){
        if(realy-1 >= min) {
            realy--;
        }
        return realy;
    }
    public int now (int realy) {
        return realy;
    }
}
