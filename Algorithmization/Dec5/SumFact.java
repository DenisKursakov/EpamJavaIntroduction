package EpamJavaTrainee.Algorithmization.Dec5;

public class SumFact {
    public void sum (){
        Fact fact = new Fact();
        int s = 0;
        for (int i = 1; i <= 9; i++) {
            if(i%2!=0){
                s = s + fact.factor(i);
            }
        }
        System.out.println("Сумма факториалов нечетных чисел равна: " + s);
    }
}
