package _2_factorymethod.logisics;

public class Bateau implements Transport {
    @Override
    public int getVitesse() {
        return 10;
    }

    @Override
    public int getCapacite() {
        return 10000;
    }
}
