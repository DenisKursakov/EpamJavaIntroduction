package EpamJavaTrainee.BasicOOP.DragonTreasures.DragonCave;

import EpamJavaTrainee.BasicOOP.DragonTreasures.TreasureCreator.GoldTreasureCreator;
import EpamJavaTrainee.BasicOOP.DragonTreasures.TreasureCreator.SilverTreasureCreator;
import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.Treasure;

import java.util.*;

public class DragonCave {
    private static final Map<String,Treasure> drag = new HashMap<>();
    private static final List<String> dragonList = new ArrayList<>();
    public void listInfo (){
        System.out.println("Список сокровищь в пещере: ");
        for (int i = 0; i < dragonList.size(); i++) {
            System.out.println(dragonList.get(i));
        }
    }
    public void mostExpensive (){
        System.out.println("Самое дорогое сокровище в пещере: ");
        int id = 0;
        int count = 0;
        for (int i = 0; i < dragonList.size(); i++) {
            int t = Integer.parseInt(dragonList.get(i).replaceAll("\\D",""));
            if( t > count){
                count = t;
                id = i;
            }

        }
        System.out.println(dragonList.get(id));
    }
    public void randomChoice (){
        int sum1 = 0;
        int sum2 = 0;
        String st = "";
        System.out.println("Введите сумму которая у вас есть: ");
        int mySum = new Scanner(System.in).nextInt();
        for (int i = 0; i < dragonList.size()-1; i++) {
            List<String> l = new ArrayList<>();
            sum1 = Integer.parseInt(dragonList.get(i).replaceAll("\\D",""));
            l.add(dragonList.get(i));
            for (int j = i+1; j < dragonList.size(); j++) {
                int t = Integer.parseInt(dragonList.get(j).replaceAll("\\D",""));
                if (sum1 + t <= mySum) {
                    sum1 += t;
                    l.add(dragonList.get(j));
                } else {
                    if(sum1 > sum2){
                        sum2 = sum1;
                        st = "";
                        for (int k = 0; k < l.size(); k++) {
                            st += l.get(j) + "\n";
                        }
                    }
                }
            }
            if (sum2 == mySum) {

                break;
            }
        }
        System.out.println("Вам предлагаются товары: ");
        System.out.println(st);
        System.out.println("На сумму: " + sum2);

    }





















    public void setTreasures (){
        String st;
        int price;

        System.out.println("Положите сокровища в пещеру: ");
        do {
            String type = "";
            System.out.println("Напишите название сокровища: ");
            st = new Scanner(System.in).nextLine();
            System.out.println("Введите цену на сокровище: ");
            price = new Scanner(System.in).nextInt();
            while (!type.equals("серебро") && !type.equals("золото")) {
                System.out.println("Введите тип сокровища (серебро/золото)");
                type = new Scanner(System.in).nextLine();
            }
            if(type.equals("золото")){
                drag.put(type, new GoldTreasureCreator().create(st,price));
            } else drag.put(type,new SilverTreasureCreator().create(st,price));
            dragonList.add(st + " цена: " + price + " тип - " + type );
            System.out.println("Добавить еще одно сокровище? (да,нет)");
            st = new Scanner(System.in).nextLine();

        } while (!st.equals("нет"));
    }
}
