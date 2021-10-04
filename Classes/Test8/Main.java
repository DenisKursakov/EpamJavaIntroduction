package EpamJavaTrainee.Classes.Test8;

public class Main {
    public static void main(String[] args) {
        Air air1 = new Air("London",10,"Long",15,"Monday");
        Air air2 = new Air("Parish",11,"Short",20,"Sunday");
        Air air3 = new Air("Russia",10,"Long",22,"Friday");
        Air air4 = new Air("Belarus",13,"Short",19,"Tuesday");
        Air air5 = new Air("Belarus",12,"Long",20,"Monday");
        Air[] airport = {air1,air2,air3,air4,air5};
        air1.searchPlace(airport);
        air1.searchDay(airport);
        air1.searchDayTime(airport);
    }
}
