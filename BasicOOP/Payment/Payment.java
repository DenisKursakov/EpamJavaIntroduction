package EpamJavaTrainee.BasicOOP.Payment;

import java.util.*;

public class Payment {
    private static List<String> arr = new ArrayList<>();
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map = list(map);
        int sum = 0;
        System.out.println("Ваш список покупок");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
            sum += map.get(arr.get(i));
        }
        System.out.println("Сумма к оплате: " + sum);
    }

    public static Map<String, Integer> list (Map<String, Integer> list) {
        System.out.println("Хотите добавить товар в список покупок? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s) {
            case "yes":
                String st;
                do {
                    System.out.println("Введите название товара для добавления в список");
                     st = new Scanner(System.in).nextLine();
                    arr.add(st);
                    System.out.println("Введите цену товара ");
                    int price = new Scanner(System.in).nextInt();
                    list.put(st, price);
                    System.out.println("Товар добавлен, хотите добавить еще один товар? (yes/no)");
                    st = new Scanner(System.in).nextLine();
                    while (!st.equals("yes") && !st.equals("no")) {
                        System.out.println("Вы ввели некоректный ответ, попробуйте снова (yes/no)");
                        st = new Scanner(System.in).nextLine();
                    }

                } while (!st.equals("no"));
                return list;
            case "no":
                return list;
            default:
                System.out.println("Вы ввели некоректный ответ, попробуйте снова: ");
                return list(list);
        }
    }

}
