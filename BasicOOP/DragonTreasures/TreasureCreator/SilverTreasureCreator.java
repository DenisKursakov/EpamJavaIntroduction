package EpamJavaTrainee.BasicOOP.DragonTreasures.TreasureCreator;

import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.SilverTreasure;
import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.Treasure;

public class SilverTreasureCreator implements ITreasureCreator{
    @Override
    public Treasure create(String name, int price) {
        return new SilverTreasure(name, price);
    }
}
