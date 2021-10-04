package EpamJavaTrainee.SoftCode.LinePrograms;

public class Line10 {
    public static void main(String[] args) {
        int a = 5, b = 10;
        int x = 9,y = 15,z = 2;
        //Мы знаем что этот ИФ большой это не очень, но когда рещили и посмотрели ответы других типов у всех было +- так же
            if (((a >= x && (b >=y || b>=z))||((a >= y)&&(b >= x || b >= z))||((a>=z)&&(b>=x||b>=y)))) {
                System.out.println("Проходит");
            }else System.out.println("Не проходит");


    }
}
