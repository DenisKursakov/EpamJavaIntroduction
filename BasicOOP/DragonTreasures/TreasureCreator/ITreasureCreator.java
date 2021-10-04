package EpamJavaTrainee.BasicOOP.DragonTreasures.TreasureCreator;

import EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures.Treasure;

public interface ITreasureCreator {
    Treasure create (String name, int price);
}
