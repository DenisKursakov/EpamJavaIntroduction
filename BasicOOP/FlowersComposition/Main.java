package EpamJavaTrainee.BasicOOP.FlowersComposition;

import EpamJavaTrainee.BasicOOP.FlowersComposition.Flowers.Composition;

public class Main {
    public static void main(String[] args) {
        Composition composition = new Composition(15, new Wrapper("Бумажная"));
        composition.create();
        System.out.println(composition.getInfo());
        composition.include();
    }
}
