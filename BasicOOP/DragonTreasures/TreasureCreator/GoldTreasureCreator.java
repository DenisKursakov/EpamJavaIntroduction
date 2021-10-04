package EpamJavaTrainee.BasicOOP.DragonTreasures.TreasureCreator;

import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.GoldTreasure;
import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.Treasure;

public class GoldTreasureCreator implements ITreasureCreator{
    @Override
    public Treasure create(String name, int price) {
        return new GoldTreasure(name,price);
    }
}
