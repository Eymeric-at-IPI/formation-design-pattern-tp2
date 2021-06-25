package _2_factorymethod.logisics;

public class Camion implements Transport {
    @Override
    public int getVitesse() {
        return 100;
    }

    @Override
    public int getCapacite() {
        return 100;
    }
}
