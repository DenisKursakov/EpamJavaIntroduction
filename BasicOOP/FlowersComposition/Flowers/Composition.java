package EpamJavaTrainee.BasicOOP.FlowersComposition.Flowers;

import EpamJavaTrainee.BasicOOP.FlowersComposition.Wrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Composition {
    private int size;
    private Wrapper wrapper;
    private List<Object> comp = new ArrayList<>(size+1);
    private int rose = 0;
    private int gvo = 0;
    private int tul = 0;

    public Composition(int size, Wrapper wrapper) {
        this.size = size;
        this.wrapper = wrapper;
    }
    public void create (){
        String st = "";
        do {
            System.out.println("Выберите цветы для композции? (Розы, Тюльпаны, Гвоздики)");
            st = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);
            if (!st.equals("розы") && !st.equals("тюльпаны") && !st.equals("гвоздики")) {
                System.out.println("Вы ввели некоретный ответ, попробуйте еще раз");
            }
        } while (!st.equals("розы") && !st.equals("тюльпаны") && !st.equals("гвоздики"));
        int t = this.size;

        adder(t,st);

    }
    public void adder (int t, String st){
        int p;
            System.out.println("Введите кол-во цветов " + st + " не превышающее: " + t);
            p = new Scanner(System.in).nextInt();
            if (p > t || p < 0) {
                System.out.println("Вы ввели некоретное число, попробуйте снова: ");
                adder(t,st);
            }

        this.size = size - p;
        while (p != 0) {
            switch (st){
                case "розы":
                    this.rose++;
                    break;
                case "гвоздики":
                    this.gvo++;
                    break;
                case "тюльпаны":
                    this.tul++;
                    break;
            }
            comp.add(new Flower(st));
            p--;
        }
        if(size == 0){
            System.out.println("Букет уже собран на нужное кол-во цветов");
            comp.add(wrapper);
        } else {
            System.out.println("Добавить еще один вид в композицию? (да,нет)");
            String yep = "";
            while (!yep.equals("да") && !yep.equals("нет")) {
                yep = new Scanner(System.in).nextLine().toLowerCase(Locale.ROOT);
                switch (yep) {
                    case "да":
                        create();
                    case "нет":
                        if (size != 0) {
                            System.out.println("Букет заполнен не до конца, пожалуйста добавьте цветы");
                            create();
                        }
                        return;
                    default:
                        System.out.println("Вы ввели некоретный ответ, попробуйте снова (да,нет)");
                }
            }

        }
    }
    public void include () {
        for (int i = 0; i < comp.size(); i++) {
            System.out.println(comp.get(i).toString());
        }
    }


    public String getInfo() {
        return "Ваш букет : Розы - "+ rose + " Гвоздики - " + gvo + " Тюльпаны - " + tul + " Обертка - " + wrapper.toString();
    }
}
