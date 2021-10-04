package EpamJavaTrainee.Classes.Test8;

import java.util.Scanner;

public class Air {
    private String place;
    private int raceNumber;
    private String type;
    private int  time;
    private String days;
    public Air(String place, int raceNumber, String type, int time, String days){
        setPlace(place);
        setRaceNumber(raceNumber);
        setType(type);
        setTime(time);
        setDays(days);
    }
    public String toString(){
        return place + " " + raceNumber + " " + type + " " + time + " " + days;
    }
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getRaceNumber() {
        return raceNumber;
    }

    public void setRaceNumber(int raceNumber) {
        this.raceNumber = raceNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }
    public void searchPlace (Air[] airport){
        System.out.println("Введите место прибытия: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < airport.length; i++) {
            if (airport[i].place.equals(s)){
                System.out.println(airport[i].toString());
            }
        }
    }
    public void searchDay (Air[] airport) {
        System.out.println("Введите день отправления: ");
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        for (int i = 0; i < airport.length; i++) {
            if(airport[i].days.equals(d)){
                System.out.println(airport[i].toString());
            }
        }
    }
    public void searchDayTime (Air[] airport) {
        System.out.println("Введите день отправления с указанным временем: ");
        Scanner scanner = new Scanner(System.in);
        String d = scanner.nextLine();
        for (int i = 0; i < airport.length; i++) {
            if(airport[i].days.equals(d) && airport[i].time > 19){
                System.out.println(airport[i].toString());
            }
        }
    }
}
