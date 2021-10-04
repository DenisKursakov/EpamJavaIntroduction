package EpamJavaTrainee.Classes.Test3;

import java.util.Scanner;

public class Trains {
    private int numb;

    public int getNumb() {
        return numb;
    }

    public void setNumb(int numb) {
        this.numb = numb;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int time;
    private String name;
    public void sort (Trains [] trains){
        int k = 1;
        for (int i = 0; i < trains.length; i++) {
            for (int j = k; j < trains.length; j++) {
                if(trains[i].numb > trains[j].numb){
                    Trains t = trains[j];
                    trains[j] = trains[i];
                    trains[i] = t;
                }
            }
            System.out.println(trains[i].numb);
            k++;
        }
    }
    public void sortplace (Trains [] trains){
        int k = 1;
        for (int i = 0; i < trains.length; i++) {
            for (int j = k; j < trains.length; j++) {
                if(trains[i].name.equals(trains[j].name) && trains[i].time > trains[j].time){
                        Trains t = trains[j];
                        trains[j] = trains[i];
                        trains[i] = t;
                }
            }
            System.out.println(trains[i].name + " " + trains[i].time);
            k++;
        }
    }
    public void info(Trains [] trains){
        int k = 1;
        for (int i = 0; i < trains.length; i++) {
            for (int j = k; j < trains.length; j++) {
                if(trains[i].numb > trains[j].numb){
                    Trains t = trains[j];
                    trains[j] = trains[i];
                    trains[i] = t;
                }
            }
            System.out.println(trains[i].numb);
            k++;
        }
        System.out.println("Введите номер поезда");
        Scanner scanner = new Scanner(System.in);
        int e = scanner.nextInt();
        Trains t = trains[e-1];
        System.out.println("Пункт назначения: " + t.name);
        System.out.println("Номер поезда: " + t.numb);
        System.out.println("Время отправления: " + t.time);
    }
}
