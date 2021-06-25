package _2_factorymethod.logisics;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Bateau();
    }
}
