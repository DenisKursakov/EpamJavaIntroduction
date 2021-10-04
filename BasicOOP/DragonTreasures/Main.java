package EpamJavaTrainee.BasicOOP.DragonTreasures;

import EpamJavaTrainee.BasicOOP.DragonTreasures.DragonCave.DragonCave;

public class Main {
    public static void main(String[] args) {
        DragonCave dragonCave = new DragonCave();


        dragonCave.setTreasures();
        System.out.println();
        dragonCave.listInfo();
        System.out.println();
        dragonCave.mostExpensive();
        System.out.println();
        dragonCave.randomChoice();
    }
}
