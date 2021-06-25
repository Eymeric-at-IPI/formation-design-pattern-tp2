package _2_factorymethod.logisics;

public class Avion implements Transport {
    @Override
    public int getVitesse() {
        return 1000;
    }

    @Override
    public int getCapacite() {
        return 10;
    }
}
