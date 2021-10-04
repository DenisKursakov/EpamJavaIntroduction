package EpamJavaTrainee.BasicOOP.DragonTreasures.Treasures;

public abstract class Treasure {
    protected String name;
    protected int price;

    public Treasure(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
