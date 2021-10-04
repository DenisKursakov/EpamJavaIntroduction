package EpamJavaTrainee.BasicOOP.Calendar;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {

    private static final String[] week = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

    public static void main(String[] args) {
        List<Months> arr = new ArrayList<>(12);
        arr.add(new Months("Январь", "Пятница", 31));
        arr.add(new Months("Февраль", Months.getFirstDay(arr.get(0)), 28));
        arr.add(new Months("Март", Months.getFirstDay(arr.get(1)), 31));
        arr.add(new Months("Апрель", Months.getFirstDay(arr.get(2)), 30));
        arr.add( new Months("Май", Months.getFirstDay(arr.get(3)), 31));
        arr.add(new Months("Июнь", Months.getFirstDay(arr.get(4)), 30));
        arr.add(new Months("Июль", Months.getFirstDay(arr.get(5)), 31));
        arr.add(new Months("Август", Months.getFirstDay(arr.get(6)), 31));
        arr.add(new Months("Сентябрь", Months.getFirstDay(arr.get(7)), 30));
        arr.add(new Months("Октябрь", Months.getFirstDay(arr.get(8)), 31));
        arr.add(new Months("Ноябрь", Months.getFirstDay(arr.get(9)), 30));
        arr.add(new Months("Декабрь", Months.getFirstDay(arr.get(10)), 31));

        System.out.println("Введите интересующий месяц: ");
        String st = new Scanner(System.in).nextLine();
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).name.toLowerCase(Locale.ROOT).equals(st.toLowerCase())){
                arr.get(i).getInfo();
            }
        }

    }

    public static class Months {

        String name;
        String firstDay;
        private final int days;

        public Months(String name, String firstDay, int days) {
            this.name = name;
            this.firstDay = firstDay;
            this.days = days;

        }

        public void getInfo() {
            System.out.println("Введите интересующий день(число): ");
            int day = new Scanner(System.in).nextInt();
            if (day < 0 || day > days) {
                System.out.println("Вы ввели некоректный день, пропробуйте снова");
                getInfo();
            }
            String dayWeek;
            if (day % 7 == 0) {
                dayWeek = week[getFirstDayId() + 6];
            } else if(day%7 + getFirstDayId() - 1 > 6){
                dayWeek = week[day%7 - getFirstDayId()];
            } else dayWeek = week[day%7 + getFirstDayId() - 1];

            switch (dayWeek) {
                case ("Суббота"):
                case ("Воскресенье"):
                    System.out.println(day + " число это: " + dayWeek + " - Выходной");
                    break;
                default:
                    System.out.println(day + " число это: " + dayWeek + " - Будний день, Вам на работу или в школу, хахах");
            }
            System.out.println("Повторить? (да/нет)");
            String st = new Scanner(System.in).nextLine();
            while (!st.equals("да") && !st.equals("нет")){
                System.out.println("Некоректный ввод попробуйте снова: Повторить? (да/нет)");
                st = new Scanner(System.in).nextLine();
            }
            if (st.equals("да")){
                getInfo();
            }
        }

        public static String getFirstDay(Months month) {
            if (month.getIdLastDay() == 6) {
                return week[month.getIdLastDay() - 6];
            } else return week[month.getIdLastDay() + 1];
        }

        public int getFirstDayId() {
            for (int i = 0; i < week.length; i++) {
                if (firstDay.equals(week[i])) {
                    return i;
                }
            }
            return 0;
        }

        public int getIdLastDay() {
            int index = 0;
            for (int i = 0; i < week.length; i++) {
                if (firstDay.equals(week[i])) {
                    index = i;
                }
            }
            int idLastDay = index + days - 29;
            if (idLastDay >= 7) {
                return idLastDay - 7;
            } else return idLastDay;
        }

    }
}
